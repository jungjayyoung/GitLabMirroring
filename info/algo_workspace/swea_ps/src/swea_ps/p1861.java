package swea_ps;


import java.io.*;
import java.util.*;


public class p1861 {

	
	static int[][] board;
	static boolean[][] visited;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	
	static int n;
	static int cnt;
	static int ans;
	static int idx;
	
	static void dfs(int x,int y) {
		
		visited[y][x] = true;
		cnt++;
		
		for(int i = 0; i <4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty < 0 || nextx >= n || nexty >= n) continue;
			
			
			if(visited[nexty][nextx] == false && board[y][x] + 1 == board[nexty][nextx]) {
				dfs(nextx,nexty);
			}
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		
		
		for(int t = 1; t <= tc; t++) {
			
			n = Integer.parseInt(br.readLine());
			
			board = new int[n][n];
			visited = new boolean[n][n];
			
			for(int y = 0; y <n; y++) {
				st = new StringTokenizer(br.readLine()," ");
				
				for(int x = 0; x <n; x++) {
				
					board[y][x] = Integer.parseInt(st.nextToken());
					
				}
			}
			
			idx = 100000;
			ans = 1;
			
			
			for(int y = 0; y < n; y++) {
				
				for(int x = 0; x < n; x++) {
					
					for(boolean[] arr: visited) {
						Arrays.fill(arr, false);
					}
					cnt = 0;
					
					
					dfs(x,y);
					
					if(ans < cnt) {
						ans = cnt;
						idx = board[y][x];
						
					}else if(ans == cnt) {
						idx = Math.min(idx, board[y][x]);
					}
					
					
				}
			}
			
			sb.append("#").append(t).append(" ").append(idx).append(" ").append(ans).append("\n");
			
			
			
		}
		
		System.out.println(sb.toString());
		
		
	}

}
