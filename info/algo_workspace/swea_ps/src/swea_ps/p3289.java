package swea_ps;

import java.io.*;
import java.util.*;



public class p3289 {
	
	static int n,m;
	
	static int parent[];
	static int tree_node[];
	
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
		
		if(tree_node[uu] <= tree_node[vv]) {
			
			parent[uu] = vv;
			tree_node[uu] += tree_node[vv];
			
		}else {
			parent[vv] = uu;
			tree_node[vv] += tree_node[uu]; 
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <=tt; t++) {
			
			st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
	
			parent = new int[n + 1];
			tree_node = new int[n + 1];
			
			for(int i = 1; i <=n; i++) {
				parent[i] = i;
			}
			
			for(int i = 1; i<=n;i++) {
				tree_node[i] = 1;
			}
			
			sb.append("#").append(t).append(" ");
			for(int i = 0; i <m; i++) {
				st =new StringTokenizer(br.readLine()," ");
				int a,b,c;
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());		
				if(a == 0) {
					
					join_node(b, c);
				}else if(a == 1) {
					
					int bb = find_parent(b);
					int cc = find_parent(c);
					
					if(bb == cc) {
						sb.append("1");
					}else {	
						sb.append("0");
					}
					
				}
				
				
			}
			sb.append("\n");
			
			
			
		}
		
		System.out.println(sb.toString());
		
	}

}
