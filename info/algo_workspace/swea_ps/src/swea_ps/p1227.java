package swea_ps;
import java.util.*;
import java.io.*;


public class p1227 {
	
	static int board[][];
	static int visited[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	static void bfs() {
		
		Queue<int[]> q = new ArrayDeque<int[]>();
		q.offer(new int[] {1,1});
		visited[1][1] = 0;
		
		while(!q.isEmpty()) {
			
			int [] pos = q.poll();
			
			int cur_x = pos[0];
			int cur_y = pos[1];
			
			for(int i = 0; i <4; i++) {
				int nextx = cur_x + dx[i];
				int nexty = cur_y + dy[i];
				
				if(nextx < 0 || nexty < 0 || nextx >= 100 || nexty >= 100) continue;
				
				if(board[nexty][nextx])
				
			}
			
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		for(int t = 1; t<=10; t++) {
			
			board = new int[101][101];
			visited = new int[101][101];
			
			
			
			for(int y = 0; y <100; y++) {
				st = new StringTokenizer(br.readLine()," ");
				
				for(int x = 0; x< 100; x++) {
					board[y][x] = Integer.parseInt(st.nextToken());
				}
			}
			
			
			bfs();
			
			
		}
		

	}

}
