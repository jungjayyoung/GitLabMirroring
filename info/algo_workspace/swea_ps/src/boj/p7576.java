package boj;

import java.io.*;
import java.util.*;

public class p7576 {
	
	static int m,n;
	static int board[][];
	static int visited[][];
	static Queue<int []> q = new ArrayDeque<int[]>();
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int ans = 0;
	
	static void bfs() {
		
		while(!q.isEmpty()) {
			
			int tmp[] = q.poll();
			
			int x = tmp[0];
			int y = tmp[1];
			int cnt = tmp[2];
			
			ans = Math.max(ans, cnt);
			
			for(int i=0; i< 4; i++) {
				int nextx = x + dx[i];
				int nexty = y + dy[i];
				if(nextx <0 || nexty < 0 || nextx >= m || nexty >= n) continue;
				
				if(visited[nexty][nextx] == 0 && board[nexty][nextx] == 0) {
					visited[nexty][nextx] = 1;
					board[nexty][nextx] = 1;
					q.offer(new int[] {nextx,nexty,cnt+1});
					
				}
				
			}
		
		}
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		st = new StringTokenizer(br.readLine()," ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		visited = new int[n][m];
		
		for(int y = 0; y <n; y++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x <m; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
				if(board[y][x] == 1) {
					q.offer(new int[] {x,y,0});
					visited[y][x] = 1;
				}
			}
		}
		
		bfs();

		boolean check = false;
		for(int y = 0; y <n; y++) {

			for(int x = 0; x <m; x++) {

				if(board[y][x] == 0) {
					check = true;
				}
			}
		}
		
		if(check) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
		

	}

}