package swea_ps;

import java.io.*;
import java.util.*;
public class p8382 {

	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static boolean visited[][][]; // 방문체크를 가로로 했는지 세로로 했는지도 체크해야 한다.
	static int x1,y1,x2,y2;
	static int ans = Integer.MAX_VALUE;
	static void bfs() {
		
		Queue<int[]> q = new ArrayDeque<>();
		
		q.offer(new int[] {x1,y1,0,0}); // 0 이면 가로
		q.offer(new int[] {x1,y1,1,0}); // 1이면 세로
		
		visited[y1][x1][0] = true;
		visited[y1][x1][1] = true;
		
		
		while(!q.isEmpty()) {
			
			int tmp[] = q.poll();
			int x = tmp[0];
			int y = tmp[1];
			int dir = tmp[2];
			int cnt = tmp[3];
			
			
			
			if(x == x2 && y == y2) {
				ans = Math.min(ans, cnt);
				break;
			}
			
			
			for(int i = 0; i < 4; i++) {
				int nextx = x + dx[i];
				int nexty = y + dy[i];
				
				if(nextx < 0 || nexty < 0 || nextx >= 201 || nexty >= 201) continue;
				
				if(dir == 0 && !visited[nexty][nextx][1]) {
					if(i == 1 || i == 3) {
						q.offer(new int[] {nextx,nexty,1,cnt+1});
						visited[nexty][nextx][1] = true;
					}
					
				}else if(dir == 1 && !visited[nexty][nextx][0]) {
					
					if(i == 0 || i == 2) {
						q.offer(new int[] {nextx,nexty,0,cnt+1});
						visited[nexty][nextx][0] = true;
					}
					
				}
				
				
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= tt; t++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			visited = new boolean[202][202][2];
			
			x1 = x1 + 100;
			y1 = y1 + 100;
			x2 = x2 + 100;
			y2 = y2 + 100;
			ans = Integer.MAX_VALUE;
			bfs();
			
			
			
			System.out.println("#" + t + " " + ans);
			
		}
	}

}
