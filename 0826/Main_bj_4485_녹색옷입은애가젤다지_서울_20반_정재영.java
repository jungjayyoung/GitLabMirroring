package boj;

import java.io.*;
import java.util.*;


public class p4485 {
	
	static int n;
	static int[][] board;
	static int[][] dist;
	static boolean[][] visited;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	static List<int[]> a = new ArrayList<int[]>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cnt = 1;
		while(true) {
			
			n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			board = new int[n+1][n+1];
			dist = new int [n+1][n+1];
			visited = new boolean[n+1][n+1];
			for(int y = 0; y < n; y++) {
				
				st = new StringTokenizer(br.readLine()," ");
				for(int x = 0; x < n; x++) {
					board[y][x] = Integer.parseInt(st.nextToken());
					dist[y][x] = Integer.MAX_VALUE;
				}
			}
			
			PriorityQueue<int[]> pq = new PriorityQueue<>((p1,p2) -> Integer.compare(p1[2], p2[2]));
			
			dist[0][0] = board[0][0];
			pq.offer(new int[] {0,0,board[0][0]}); // x,y,가중치
			
			
			while(!pq.isEmpty()) {
				
				int [] cur = pq.poll();
				int curx = cur[0];
				int cury = cur[1];
				int cur_money = cur[2];
				
				
				
				if(visited[cury][curx]) continue; // 최소 금화가 보장된 노드는 true 선언
				
				visited[cury][curx] = true;
				if(curx == n -1 && cury == n-1) {
					
					break;
				}
				
				for(int i = 0; i <4; i++) {
					int nextx = curx + dx[i];
					int nexty = cury + dy[i];
					
					if(nextx < 0 || nexty < 0 || nextx >= n || nexty >= n)
						continue;
					if(!visited[nexty][nextx] && 
							dist[nexty][nextx] > cur_money + board[nexty][nextx]) {
							dist[nexty][nextx] = cur_money + board[nexty][nextx];
							pq.offer(new int[] {nextx,nexty,dist[nexty][nextx]});
						
					}
					
				}
				
				
			}
			
			
			System.out.println("Problem " + cnt + ": " +dist[n-1][n-1]);
			
			cnt++;
			
		}
		
		
		
		
		
		

	}

}
