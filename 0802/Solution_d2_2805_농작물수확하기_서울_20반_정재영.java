import java.io.*;
import java.util.*;


public class p2805 {
	

	

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tc = Integer.parseInt(bf.readLine());
		
		for(int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(bf.readLine());
			
			int [][] board = new int [n][n];
			int [][] visited = new int [n][n];
			
			
			for(int y=0;y<n;y++) {
				st = new StringTokenizer(bf.readLine());
				String s = st.nextToken();
				for(int x = 0; x <n;x++) {
					
					board[y][x] = (int)s.charAt(x) - '0';
				}
			}
			int xx = n - ((n -1) / 2) - 1;
			int yy = n - ((n -1) / 2) - 1;
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(xx,yy,0));
			visited[yy][xx] = 1;
			
			int [] dx = {-1,0,1,0};
			int [] dy = {0,1,0,-1};
			
			int sum = board[yy][xx];
			int cnt = ((n + 1) / 2) - 1;
			
			while(!q.isEmpty()) {
				
				Pair cur = q.poll();
				int cur_x = cur.x;
				int cur_y = cur.y;
				int cur_s = cur.s;
				
				if(cur_s >= cnt) {
					continue;
				}
				
				
				for(int i =0; i<4; i++) {
					int nextx = cur_x + dx[i];
					int nexty = cur_y + dy[i];
					
					if(nextx <0 || nextx >= n || nexty < 0 || nexty >= n)
						continue;
					
					if(visited[nexty][nextx] == 0) {
						visited[nexty][nextx] = 1;
						sum += board[nexty][nextx];
						q.add(new Pair(nextx,nexty,cur_s + 1));
					}
				}
					
			}
			
			
			
			System.out.println("#" + t + " " + sum);
			
			
		}
		
		
		
		
		
		
		

	}
	
	public static class Pair{
		int x,y,s;
		Pair(int x, int y, int s){
			this.x = x;
			this.y = y;
			this.s = s;
		}
	}

}
