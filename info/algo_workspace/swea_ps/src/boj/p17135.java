package boj;

import java.io.*;
import java.util.*;

public class p17135 {

	
	static int n,m,D;
	static int board[][];
	static int tmp[][];
	static List<Integer> archers;
	
	static int ans = 0; // 잡을 수 있는 궁수의 최대 수
	
	
	static void bt(int cnt,int start) {
		
		// 궁수 3명의 자리를 정함
		if(cnt == 3) {
			tmp = new int[n + 1][m + 1];
			for(int y =0; y < n; y++) {
				for(int x = 0; x <m;x++) {
					tmp[y][x] = board[y][x];
				}
			}
			
			int kill = 0;
			
			while(true) {
				
				int a1x = -1;
				int a1y = -1;
				int a2x = -1;
				int a2y = -1;
				int a3x = -1;
				int a3y = -1;
				
				// 먼저 적들의 위치와 현재 궁수들의 위치를 비교해 보자
				// 모든 x,y에 대해서 가장 가까운 적의 위치를 찾아야 한다.
				// 아래부터 적을 찾아야 가장 가까운 적을 찾을 수 있다.
				// 따라서 y = n-1 부터 시작한다.
				int dist[] = {987654,987654,987654}; // 궁수와 적의 거리 중 가장 최소 값 찾기
				int tmpp[] = {987654,987654,987654};
				for(int y = n-1;y >= 0; y--) {
					
					for(int x = 0; x <m; x++) {
						
						//적 발견
						if(tmp[y][x] == 1) {
							
							
							int xx[] = new int[3];
							int yy[] = new int[3];
							// 궁수 한 명 한명과의 거리를 비교한다.
							for(int i = 0; i <archers.size();i++) {
								yy[i] = n; // 궁수의 y좌표
								xx[i] = archers.get(i); // 궁수의 x좌표
								
								// 여기서 궁수와 적 사이의 최소 거리를 구한다.
								if(dist[i] > Math.abs(x - xx[i]) + Math.abs(y - yy[i])) {
									dist[i] = Math.abs(x - xx[i]) + Math.abs(y - yy[i]);
								}
								
							}
							
						}
						
						
					}
				}
				// 최소거리를 바탕으로 적 선택
				for(int y = n-1;y >= 0; y--) {
					
					for(int x = 0; x <m; x++) {
						
						//적 발견
						if(tmp[y][x] == 1) {
						
							
							for(int i = 0; i <archers.size();i++) {
								int yy = n; // 궁수의 y좌표
								int xx = archers.get(i); // 궁수의 x좌표
								
								if(dist[i] <= D && Math.abs(xx-x) + Math.abs(yy -y) <= dist[i]) {
									if(i == 0) {
										if(a1x == -1) {
											a1x = x;
											a1y = y;
										}else if(a1x > x) {
											a1x = x;
											a1y = y;
										}
											
				
									}else if(i == 1) {
										if(a2x == -1) {
											a2x = x;
											a2y = y;
										}else if(a2x > x) {
											a2x = x;
											a2y = y;
										}
									}else if(i == 2) {
										if(a3x == -1) {
											a3x = x;
											a3y = y;
										}else if(a3x > x) {
											a3x = x;
											a3y = y;
										}
									}
								}
							}
							
						}
						
						
					}
				}
				
				
				
				
				
				// 적들을 다 죽여버린다.
				if((a1x != -1 && a1y != -1)) {
					if(tmp[a1y][a1x] == 1) {
						kill++;
						tmp[a1y][a1x] = 0;
					}
					
				}
				if((a2x != -1 && a2y != -1)) {
					if(tmp[a2y][a2x] == 1) {
						kill++;
						tmp[a2y][a2x] = 0;
					}
					
				}
				if((a3x != -1 && a3y != -1)) {
					if(tmp[a3y][a3x] == 1) {
						kill++;
						tmp[a3y][a3x] = 0;
					}
					
				}
				
				// 적들이 아래로 내려간다.
				for(int x = 0; x <m; x++) {
					
					for(int y = n - 1; y >= 1; y--) {
						
						tmp[y][x] = tmp[y-1][x];
						
					}
					tmp[0][x] = 0;
				}
				
				
				
				// 적들이 없는지 체크
				boolean check = false;
				
				for(int y = 0; y <n; y++) {
					for(int x = 0; x <m;x++) {
						
						if(tmp[y][x] == 1) {
							check = true;
						}
						
					}
				}
				
				if(!check)
					break;
				
			}
			
			
			ans = Math.max(ans, kill);
			
			return;
		}
		
		for(int i = start; i < m; i++) {
			
			archers.add(i);
			bt(cnt + 1,i + 1);
			archers.remove(cnt);
			
			
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		archers = new ArrayList<Integer>();
		board = new int[n + 1][m + 1];
		
		for(int y = 0; y < n; y++) {
			st = new StringTokenizer(br.readLine()," ");
			
			for(int x = 0; x < m; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
			}
		}
		
		bt(0,0);
		
		System.out.println(ans);
		
	}

}