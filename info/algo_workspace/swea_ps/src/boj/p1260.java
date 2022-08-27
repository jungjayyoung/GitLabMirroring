package boj;

import java.io.*;
import java.util.*;

public class p1260 {
	static int n,m,v;
	static List<Integer>[] node;
	static boolean visited[];

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		node = new List[n + 1];
		visited = new boolean[n + 1];
		
		for(int i = 0; i <n + 1; i++) {
			node[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			node[a].add(b);
			node[b].add(a);
			
		}
		
		for(int i =1; i<=n; i++) {
			Collections.sort(node[i]);
		}
		
		dfs(v);
		System.out.println();
		visited = new boolean[n + 1];
		bfs(v);
		
		
		
		
	}
	
	static void dfs(int cur) {
		
		visited[cur] = true;
		
		System.out.print(cur + " ");
		
		for(int i = 0; i <node[cur].size();i++) {
			
			int next = node[cur].get(i);
			
			if(!visited[next]) {
				dfs(next);
			}
			
		}
		
	}
	
	static void bfs(int j) {
		Queue<Integer> q = new ArrayDeque<>();
		
		q.offer(j);
		visited[j] = true;
		
		while(!q.isEmpty()) {
			
			int cur = q.poll();
			System.out.print(cur + " ");
			for(int i = 0; i< node[cur].size();i++) {
				
				int next = node[cur].get(i);
				
				if(!visited[next]) {
					visited[next] = true;
					q.offer(next);
				}
				
			}
			
			
		}
		
		
		
		
	}

}