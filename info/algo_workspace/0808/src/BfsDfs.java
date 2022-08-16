import java.io.*;
import java.util.*;


public class BfsDfs {

	static int[] dx = {0,1,0,-1}; // 상우하좌
	static int[] dy = {1,0,-1,0}; // 상우하좌
	static int N = 5, C;
	static int[][] a;
	static boolean[][] visited;
	
	static void bfs(int x, int y,int sum, int avg,int cnt) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visited[y][x] = true;
		
		q.offer(new int[] {x,y,sum,avg,cnt});
		
		while(!q.isEmpty()) {
			
			int[] xy = q.poll();
			x = xy[0];
			y = xy[1];
			a[y][x] = C++;
			
			for(int i = 0 ; i< 4; i++) {
				int nextx = x + dx[i];
				int nexty = y + dy[i];
				
				if(nextx < 0 || nexty < 0 || nextx >= N || nexty >= N) continue;
				
				if(!visited[nexty][nextx]) {
					visited[nexty][nextx] = true;
					q.offer(new int[] {nextx,nexty});
				}
				
			}
			
			
		}
		
		
		
	}
	
	
	static void dfs(int x,int y) {
		
		visited[y][x] = true;
		a[y][x] = C;
		C++;
		for(int i=0; i< 4; i++) {
			
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty < 0 || nextx >= N || nexty >= N) continue;
			
			if(!visited[nexty][nextx]) {
				dfs(nextx,nexty);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) throws Exception{
		a = new int[N][N];
		visited = new boolean[N][N];
		C = 1;
		//dfs(N/2,N/2);
		//bfs(N/2,N/2);
		
		for(int[] b: a) System.out.println(Arrays.toString(b)); System.out.println();
		
		
	}

}
