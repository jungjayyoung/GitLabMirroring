package swea_ps;

import java.io.*;
import java.util.*;

public class p1238 {

	static int n,m;
	static List<Integer>[] v;
	static int[] visited; 
	static int ans = -1;
	static int maxx = -1;
	
	
	static void bfs() {
		Queue<int[]> q = new ArrayDeque<int[]>();
		
		q.offer(new int[] {m,0});
		visited[m] = 1;
		
		
		while(!q.isEmpty()) {
			
			int pos[] = q.poll();
			
			int node = pos[0];
			int cnt = pos[1];
			
			if(ans <= cnt) {
				
				if(ans < cnt) {
					ans = cnt;
					maxx = node;
				}else {
					maxx = Math.max(maxx, node);
				}
				
			}
			
			for(int i = 0; i < v[node].size();i++) {
				int next = v[node].get(i);
				
				if(visited[next] == 0) {
					visited[next] = 1;
					q.offer(new int[] {next,cnt + 1});
				}
			}
			
			
		}
		
		
	}
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		for(int t = 1; t <=10; t++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			visited = new int[101];
			v = new List[101];
			maxx = -1;
			ans = -1;
			
			for(int i = 1; i <=100; i++) {
				v[i] = new ArrayList<>();
			}
			
			st = new StringTokenizer(br.readLine()," "); 
			for(int i = 0; i < n / 2; i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				v[a].add(b);
				
			}
			
			bfs();
			
			System.out.println("#" + t + " " + maxx);
			
			
		}
		
		
	}

}
