package boj;

import java.io.*;
import java.util.*;


public class p2468 {
	
	static int n;
	static int[][] board = new int[101][101];
	static int[][] visited = new int[101][101];
	static int height = 1;
	static int max_height = -1;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1}; 
	static int ans = 1;
	static int cnt = 0;
	
	static void dfs(int x,int y) {
		
		
		visited[y][x] = 1;
		
		
		for(int i = 0; i< 4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty <0 || nextx >= n || nexty >= n) continue;
			
			
			if(visited[nexty][nextx] == 0) {
				dfs(nextx,nexty);
			}
			
			
			
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		n = Integer.parseInt(br.readLine());
		
		for(int y = 0; y <n;y++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x <n; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
				max_height = Math.max(max_height, board[y][x]);
			}
		}
		
		
		for(int i = height; i <= max_height;i++) {
			
			
			for(int v[]: visited) {
				Arrays.fill(v, 0);
			}
			
			
			for(int y =0; y < n; y++) {
				
				for(int x =0; x <n; x++) {
					
					if(board[y][x] <= i) {
						visited[y][x] = 1;
					}
					
				}
			}
			
			cnt = 0;
			for(int y = 0; y < n; y++) {
				
				for(int x =0; x < n; x++) {
					if(visited[y][x] == 0) {
						cnt++;
						dfs(x,y);
					}
					
				}
			}
			
			ans = Math.max(ans, cnt);
			
		}
		
		System.out.println(ans);
		
		

	}

}