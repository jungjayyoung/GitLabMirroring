package boj;

import java.io.*;
import java.util.*;

public class p18405 {

	static int n,k;
	static int board[][];
	static int visited[][];
	static int S,X,Y;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static Queue<int[]> q = new ArrayDeque<int[]>();
	
	static void bfs() {
		
		
		while(!q.isEmpty()) {
			
			int[] pos = q.poll();
			int x = pos[0];
			int y = pos[1];
			int cur_virus = pos[2];
			
			if(visited[y][x] - 1>= S) break;
			
			
			for(int i = 0; i< 4; i++) {
				int nextx = x + dx[i];
				int nexty = y + dy[i];
				
				if(nextx < 0 || nexty < 0 || nextx >= n || nexty >= n) continue;
				
				if(board[nexty][nextx] == 0) {
					board[nexty][nextx] = cur_virus;
					visited[nexty][nextx] = visited[x][y] + 1;
					q.offer(new int[]{nextx,nexty,cur_virus});
				}
				
			}
			
			
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		st = new StringTokenizer(br.readLine()," ");
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		board = new int[n+1][n+1];
		visited = new int[n+1][n+1];
		
		
		for(int y =0; y < n; y++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x <n; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		st = new StringTokenizer(br.readLine()," ");
		S = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		
		
		for(int i = 1; i<= k; i++) {
			
			for(int y =0; y <n; y++){
				for(int x = 0; x < n;x++) {
				
					if(board[y][x] == i) {
						q.offer(new int[] {x,y,i});
						visited[y][x] = 1;
					
					}
			
				}
				
			}
		}
		
		
		bfs();
		
		
		if(board[X -1][Y - 1] == 0) {
			System.out.println(0);
		}else {
			System.out.println(board[X - 1][Y - 1]);
		}
		
		

	}

}
