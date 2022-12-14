package boj;

import java.io.*;
import java.util.*;


public class Main_bj_17822_원판돌리기_서울_20반_정재영 {
	static int n, m, t;
	static Deque<Integer> round[];
	static int arr[][];
	static boolean check = false;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	static void dfs(int x,int y, int cur_num) {
		
		for(int i = 0; i < 4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx > m -1) {
				nextx = 0;
			}else if(nextx < 0) {
				nextx = m - 1;
			}
			
			if(nexty > n || nexty < 0 || arr[nexty][nextx] != cur_num) continue;
			
			if(arr[nexty][nextx] == cur_num) {
				arr[nexty][nextx] = -1;
				check = true;
				dfs(nextx,nexty,cur_num);
				
			}
			
		}
		
	}
	
	static int cnt_num(int x,int y) {
		int cnt = 0;
		
		for(int yy =0; yy <y; yy++) {
			
			for(int xx = 0; xx < x; xx++) {
				if(arr[yy][xx] != -1) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		round = new ArrayDeque[n + 1];
		arr = new int[n + 1][m + 1];
		
		for(int i = 0; i <n + 1;i++) {
			round[i] = new ArrayDeque<>();
		}
		
		for(int i[] : arr) {
			Arrays.fill(i,-1);
		}
		
		for(int i = 0; i < n; i++) {
		
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < m; j++) {
				round[i].add(Integer.parseInt(st.nextToken()));
			}
			
		}
		
		// 원판 t만큼 돌리기
		for(int i = 0; i < t; i++) {
			int xx, d, k;
			st = new StringTokenizer(br.readLine()," ");
			xx = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			for(int r_num = 0; r_num < n; r_num++) {
				
				if((r_num + 1) % xx == 0) {
					
					// 시계 방향
					if(d == 0) {
						
						// k 번 회전
						for(int j = 0; j < k; j++) {
							int tmp = round[r_num].pollLast();
							round[r_num].addFirst(tmp);
							
						}
						
					// 반시계 방향
					}else if(d == 1) {
						
						// k 번 회전
						for(int j = 0; j <k; j++) {
							int tmp = round[r_num].pollFirst();
							round[r_num].addLast(tmp);
						}
						
					}
					
					
				}
				
			}
			// 원판 회전 끝
			
			// 개별 요소에 접근하기 위해 덱의 원소들을 2차원 배열로 옮겨준다.
			
			for(int y = 0; y <n; y++) {
				for(int x = 0; x <m; x++) {
					arr[y][x] = round[y].peekFirst();
					round[y].pollFirst();
				}
			}
			
			// 인접한 숫자가 존재
			boolean check2 = false;
			
			for(int y = 0; y < n; y++) {
				
				for(int x = 0; x < m; x++) {
					check = false;
					if(arr[y][x] != -1) {
						dfs(x,y,arr[y][x]);
						
						
						if(check) {
							//인접한 숫자가 존재하면 시작위치 숫자 제거
							arr[y][x] = -1;
							check2 = true;
						}
					}
				}
			}
			
			
			// 인접한 숫자가 존재하지 않는다면
			if(!check2) {
				
				int total = 0;
				double avg = 0.0;
				
				for(int y = 0; y < n; y++) {
					for(int x = 0; x <m; x++) {
						
						if(arr[y][x] != -1) {
							total += arr[y][x];
						}
					}
				}
				
				//평균 구하기
				avg = (double)total / cnt_num(m, n);
				
			
				for(int y = 0; y < n; y++) {
					for(int x = 0; x <m; x++) {
						
						if(arr[y][x] != -1) {
							if((double)arr[y][x] < avg) {
								arr[y][x] += 1;
							}else if((double)arr[y][x] > avg) {
								arr[y][x] -= 1;
							}
						}
						
					}
				}
				
				
				
				
			}
			
			for (int ii = 0; ii < n; ii++) {
				for (int jj = 0; jj < m; jj++) {
					round[ii].add(arr[ii][jj]);
				}
			}
			
			
			
			
		}	
		
		int ans = 0;
		
		for(int y = 0; y <n; y++) {
			
			for(int x = 0; x <m;x++) {
				if(arr[y][x] != -1) {
					ans += arr[y][x];
				}
			}
		}
		
		
		
		System.out.println(ans);
		
		
	}

}
