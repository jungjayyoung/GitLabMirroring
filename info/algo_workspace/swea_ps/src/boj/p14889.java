package boj;

import java.io.*;
import java.util.*;

public class p14889 {
	static int n;
	static int board[][];
	static int visited[];
	static int ans = 123456789;
	
	
	static void bt(int cnt,int start) {
		
		if(cnt >= n / 2) {
			
			int team1 = 0;
			int team2 = 0;
			
			for(int y = 0; y < n; y++) {
				
				for(int x = 0; x < n; x++) {
					
					if(visited[x] == 1 && visited[y] == 1) {
						team1 += board[y][x];
					}
					
					if(visited[x] == 0 && visited[y] == 0) {
						team2 += board[y][x];
					}
					
					
				}
			}
			
			ans = Math.min(ans, Math.abs(team2 - team1));
			
			return;
		}
		
		for(int i = start; i < n; i++) {
			
			visited[i] = 1;
			bt(cnt + 1, i + 1);
			visited[i] = 0;
			
		}
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		visited = new int[n];
		
		for(int y = 0; y < n; y++) {
			
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x < n; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
			}
		}
		
		bt(0,0);
		
		System.out.println(ans);
		
		

	}

}
