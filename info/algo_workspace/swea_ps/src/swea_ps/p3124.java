package swea_ps;
import java.io.*;
import java.util.*;

public class p3124 {
	static int v,e;
	static List<int[]> list;
	static int parent[];
	static int tree_level[];
	
	static int find_parent(int u) {
		
		if(parent[u] == u) return u;
		
		return parent[u] = find_parent(parent[u]);
	}
	
	static boolean join_node(int u, int v) {
		
		int uu = find_parent(u);
		int vv = find_parent(v);
		
		if(uu == vv) return false;
		
		if(tree_level[uu] <= tree_level[vv]) {
			parent[uu] = vv;
			tree_level[uu] += tree_level[vv];
		}else {
			parent[vv] = uu;
			tree_level[vv] += tree_level[uu];
		}
		
		return true;
		
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <=tt; t++) {
			
			st =new StringTokenizer(br.readLine()," ");
			v = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			parent = new int[v+1];
			tree_level = new int[v+1];
			
			for(int i = 1; i <=v; i++) {
				parent[i] = i;
				tree_level[i] = 1;
			}
			
			list = new ArrayList<int[]>();
			
			for(int i = 0; i < e; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				list.add(new int[] {a,b,c});
					
			}
			
			Collections.sort(list,(o1,o2) -> Integer.compare(o1[2], o2[2]));
			
			
			int result = 0;
			int cnt = 0;
			for(int i = 0; i <e; i++) {
				
				int cur[] = list.get(i);
				if(join_node(cur[0], cur[1])) {
					if(cnt == v - 1) break;
					result += cur[2];
					cnt++;
					
				}
				
			}
			
			System.out.println("#" + t + " " + result);
			
			
			
			
		}

	}

}
