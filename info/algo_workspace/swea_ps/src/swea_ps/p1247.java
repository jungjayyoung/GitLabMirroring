package swea_ps;

import java.io.*;
import java.util.*;

public class p1247 {
	static int n;
	static int cx;
	static int cy;
	static int hx;
	static int hy;
	static List<int[]> p;

	static int visited[];
	static int minn = 123456789;
	static int fx,fy;
	
	static void bt(int cnt, int sum,int pre) {
		
		if(cnt == n) {
			
			// 마지막으로 집까지의 거리까지 더한다.
			int tmp[] = p.get(pre);
			fx = tmp[0];
			fy = tmp[1];
			
			minn = Math.min(minn, sum + Math.abs(fx - hx) + Math.abs(fy - hy));
			
			
			
			return;
		}
		
		for(int i = 0; i < n; i++) {
			
			if(visited[i] == 0) {
				
				visited[i] = 1;
				int cur[] = p.get(i);
				int curx = cur[0];
				int cury = cur[1];
				
				if(pre == -1) {
					
					bt(cnt + 1, sum + Math.abs(curx - cx) + Math.abs(cury - cy),i);
					
				}else {
					int t[] = p.get(pre);
					int tx = t[0];
					int ty = t[1];
					bt(cnt + 1, sum + Math.abs(curx - tx) + Math.abs(cury - ty),i);
					
				}
			
				visited[i] = 0;
				
			}
			
			
			
		}
		
		
		
	}


	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <=tt; i++) {
			
			minn = 123456789;
			n = Integer.parseInt(br.readLine());
			p = new ArrayList<int[]>();
			visited = new int[n];
			
			
			st = new StringTokenizer(br.readLine()," ");
			cx = Integer.parseInt(st.nextToken());
			cy = Integer.parseInt(st.nextToken());
			hx = Integer.parseInt(st.nextToken());
			hy = Integer.parseInt(st.nextToken());
			
			
			for(int j = 0; j <n; j++) {
				int xx = Integer.parseInt(st.nextToken());
				int yy = Integer.parseInt(st.nextToken());
				p.add(new int[] {xx,yy});
			}
			
			bt(0,0,-1);
			
		
			System.out.println("#" + i + " " + minn);
			
			
			
			
			
		}
		
	}

}