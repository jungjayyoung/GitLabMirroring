package swea_ps;

import java.io.*;
import java.util.*;

public class p7465 {
	static int n,m;
	static int parent[];
	static int tree_level[];
	static int visited[];
	static int check[];
	static int find_parent(int u) {
		
		if(parent[u] == u) {
			
			return u;
		}
		
		return parent[u] = find_parent(parent[u]);
	}
	
	static void join_node(int u,int v) {
		
		int uu = find_parent(u);
		int vv = find_parent(v);
		
		if(uu == vv) {
			return;
		}
		
		if(tree_level[uu] <= tree_level[vv]) {
			tree_level[uu] += tree_level[vv];
			parent[uu] = vv;
		}else {
			tree_level[vv] += tree_level[uu];
			parent[vv] = uu;
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=tt; t++) {
			
			st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			parent = new int[n+1];
			tree_level = new int[n+1];
			visited = new int[n+1];
			check = new int[n+1];
			
			for(int i = 1; i <=n;i++) {
				parent[i] = i;
			}
			
			for(int i = 1; i <=n;i++) {
				tree_level[i] = 1;
			}

			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				join_node(a,b);
			}
			
			for(int i = 1; i<=n; i++) {
				
				visited[find_parent(parent[i])] = 1;
				
			}
			int ans = 0;
			for(int i = 1; i<=n;i++) {
				if(visited[i] == 1)
					ans++;
			}
			
			System.out.println("#" + t + " " + ans);
		}

	}

}
