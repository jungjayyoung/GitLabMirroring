package boj;

import java.io.*;
import java.util.*;


public class p1987 {
	
	static int r,c;
	static char board[][];
	static int visited[];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int ans = 1;
	
	static void dfs(int x,int y,int cnt) {
		
		visited[board[y][x] - 'A'] = 1;
		ans = Math.max(ans, cnt + 1);
		
		for(int i = 0; i <4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty < 0 || nextx >= c || nexty >= r) continue;
			
			if(visited[board[nexty][nextx] - 'A'] == 0) {
				
				dfs(nextx,nexty,cnt + 1);
				visited[board[nexty][nextx] - 'A'] = 0;
				
			}
		}
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		st = new StringTokenizer(br.readLine()," ");
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		board = new char[r+1][c+1];
		visited = new int[27];
		
		for(int y = 0; y < r; y++) {
			
			String s = br.readLine();
			for(int x = 0; x < c; x++) {
				
				board[y][x] = s.charAt(x);
				
			}
		}
		
		
		dfs(0,0,0);
		
		System.out.println(ans);
		
	}

}
