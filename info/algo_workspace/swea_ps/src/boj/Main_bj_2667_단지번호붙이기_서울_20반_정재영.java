package boj;

import java.io.*;
import java.util.*;

public class Main_bj_2667_단지번호붙이기_서울_20반_정재영 {

	static int board[][]; 
	static int visited[][];
	static int cnt = 0;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static List<Integer> a = new ArrayList<>();
	static int n;
	
	static void dfs(int x, int y) {
		
		visited[y][x] = 1;
		cnt++;
		
		for(int i = 0; i <4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty <0 || nextx >= n || nexty >= n) continue;
			
			if(visited[nexty][nextx] == 0 && board[nexty][nextx] == 1) {
				
				dfs(nextx,nexty);
				
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		visited = new int[n][n];
		
		for(int y = 0; y < n; y++) {
			
			String s = br.readLine();
			for(int x = 0; x < n; x++) {
				board[y][x] = s.charAt(x) - '0';
			}
		}
		

		
		for(int y = 0; y < n; y++) {
			
			for(int x = 0; x <n;x++) {
				cnt = 0;
				
				if(visited[y][x] == 0 && board[y][x] == 1) {
					dfs(x,y);
					a.add(cnt);
				}
			}
		}
		
		Collections.sort(a);
		
		System.out.println(a.size());
		for(Integer i: a) {
			System.out.println(i);
		}
		

	}

}
