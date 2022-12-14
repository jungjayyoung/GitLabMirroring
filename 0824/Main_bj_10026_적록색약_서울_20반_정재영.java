package boj;

import java.io.*;
import java.util.*;
public class Main_bj_10026_적록색약_서울_20반_정재영 {
	static int n;
	static char board[][];
	static int visited[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	
	
	static void rgb_dfs(int x,int y,char color) {
		
		
		visited[y][x] = 1;
		
		for(int i = 0; i <4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty < 0 || nextx >=n || nexty >= n) continue;
			
			if(visited[nexty][nextx] == 0 && board[nexty][nextx] == color) {
				rgb_dfs(nextx,nexty,color);
			}
		}
		
	}
	
	static void rg_dfs(int x,int y,char color) {
		
		visited[y][x] = 1;
		
		for(int i = 0; i <4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty < 0 || nextx >=n || nexty >= n) continue;
			
			if(color == 'R' || color == 'G') {
				if(visited[nexty][nextx] == 0 && 
						(board[nexty][nextx] == 'R' || board[nexty][nextx] == 'G')) {
					rg_dfs(nextx,nexty,color);
				}
			}else {
				if(visited[nexty][nextx] == 0 && board[nexty][nextx] == color)
					rg_dfs(nextx,nexty,color);
			}
			
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		n = Integer.parseInt(br.readLine());
		
		board = new char[n+1][n+1];
		visited = new int[n+1][n+1];
		for(int y = 0; y <n;y++) {
			
			String s = br.readLine();
			for(int x =0; x <n; x++) {
				board[y][x] = s.charAt(x);
				
			}
		}
		int not_rgb_cnt = 0;
		// 적록색이 아닌 사람
		for(int y = 0; y <n; y++) {
			
			for(int x = 0; x <n; x++) {
				
				if(visited[y][x] == 0) {
					not_rgb_cnt++;
					rgb_dfs(x,y,board[y][x]);
				}
			}
		}
		visited = new int[n+1][n+1];
		int rgb_cnt = 0;
		for(int y = 0; y <n; y++) {
			
			for(int x = 0; x <n; x++) {
				
				if(visited[y][x] == 0) {
					rgb_cnt++;
					rg_dfs(x,y,board[y][x]);
				}
			}
		}
		
		System.out.println(not_rgb_cnt +" " + rgb_cnt);
		

	}

}
