package boj;

import java.io.*;
import java.util.*;

// 3: 22
public class p16236 {
	static int n;
	static int[][] board;
	// 위,왼쪽,오른쪽, 아래 순
	static int dx[] = {0,-1,1,0};
	static int dy[] = {-1,0,0,1};
	static int[][] visited;
	static Queue<int[]> q = new ArrayDeque<int[]>();
	static int ans = 0;
	
	// 다음 시도: visited 체크를 해주고  bfs를 여러번 돌려주면서 check를 확인 해야 되나?
	
	
	static void bfs() {
		
		
		while(!q.isEmpty()) {
			
			int tmp[] = q.poll();
			
			int x = tmp[0];
			int y = tmp[1];
			int second = tmp[2]; // 시간이자 거리
			int cur_size = tmp[3]; // 현재 상어 사이즈
			int cur_eat = tmp[4]; // 현재 상어가 먹은 고기 수
			
			for(int i = 0; i < 4; i++) {
				int nextx = x + dx[i];
				int nexty = y + dy[i];
				
				
				if(nextx < 0 || nexty <0 || nextx >=n || nexty >=n) continue;
				
				if(visited[nexty][nextx] == 1) continue;
				
				if(board[nexty][nextx] == 0) {
					visited[nexty][nextx] = 1;
					q.offer(new int[] {nextx,nexty,second + 1,cur_size,cur_eat});
					continue;
				}
				if(cur_size < board[nexty][nextx]) continue;
				
				if(cur_size == board[nexty][nextx]) {
					q.offer(new int[] {nextx,nexty,second+1,cur_size,cur_eat});
					visited[nexty][nextx] = 1;
				// 작은 물고기 발견
				}else if(board[nexty][nextx] != 0 && cur_size > board[nexty][nextx]){
					board[nexty][nextx] = 0; // 빈공간으로 만들어 주고					
					q.clear();
					visited = new int[n+1][n+1];
					if(cur_eat + 1 == cur_size) {
						visited[nexty][nextx] = 1;
						q.offer(new int[] {nextx,nexty,second+1,cur_size+1,0});
					}else {
						visited[nexty][nextx] = 1;
						q.offer(new int[] {nextx,nexty,second + 1,cur_size,cur_eat+1});
					}
					ans = Math.max(ans, second+1);
				}
				
			
				
			}
			
			
		}
		
		
		
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		board = new int[n+1][n+1];
		visited = new int[n+1][n+1];
		
		
		for(int y = 0; y <n; y++) {
			
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x <n; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
				if(board[y][x] == 9) {
					q.offer(new int[] {x,y,0,2,0});
					board[y][x] = 0;
					visited[y][x] = 1;
				}
			}
		}
		
		bfs();
		
		System.out.println(ans);
		
		
		
	}

}
