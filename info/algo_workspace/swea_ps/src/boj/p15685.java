package boj;

import java.io.*;
import java.util.*;



public class p15685 {

	static int n;
	static int board[][] = new int[101][101];
	static List<Integer> dir_list;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		n = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			int xx,yy,d,g;
			dir_list = new ArrayList<>();
			
			xx = Integer.parseInt(st.nextToken());
			yy = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			
			
			
			dir_list.add(d); //  방향을 집어넣는다.
			//세대 만큼 돌린다.
			
			int nextx = xx;
			int nexty = yy;
			int dir;
			board[yy][xx] = 1; 
			// 0 세대부터 시작
			// 스타트 위치는 갱신만 해주고 방향만 리스트에 집어넣는다.
			for(int j = 0; j<g + 1; j++) {
				
				
				
				for(int k = dir_list.size() - 1; k >= 0; k--) {
					
					// 뒤에 부터 시계방향 회전 하고 이 방향을 리스트에 추가한다.
					
					
					
					
					dir = dir_list.get(k);
					
					if(dir == 0) { // 오른쪽
						nextx = nextx + 1;
					}else if(dir == 1) { // 위쪽
						nexty = nexty - 1;
					}else if(dir == 2) { // 왼쪽
						nextx = nextx - 1;
					}else if(dir == 3) { // 아래쪽
						nexty = nexty + 1;
					}
					board[nexty][nextx] = 1;
					
					
				}
				
				int cur_dir_size = dir_list.size();
				
				// 뒤쪽 부터 반대 방향으로 돌린뒤 시계 방향으로 방향 바꿔주기
				for(int k = cur_dir_size - 1; k >= 0;k--) {
					int cur_dir = dir_list.get(k);
					int cnt = 0;
					while(true) {
						if(cnt == 2)
							break;
						cur_dir--;
						if(cur_dir < 0)
							cur_dir = 3;
						cnt++;
					}
					cur_dir--;
					if(cur_dir < 0) {
						cur_dir = 3;
					}
					
					dir_list.add(cur_dir);
					
					
				}
				

				
			}
			
			
		}

	}

}
