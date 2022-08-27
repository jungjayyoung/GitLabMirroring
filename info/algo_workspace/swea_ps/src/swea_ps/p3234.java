package swea_ps;

import java.io.*;
import java.util.*;

public class p3234 {
	
	static boolean[] visited;
	static boolean[] v2;
	static int[] choo;
	static int n;
	static int ans = 0;
	static List<Integer> a;
	
	
	static void bt(int cnt, int r_sum,int l_sum) {
		
		if(r_sum > l_sum) return;
		
		if(cnt == n) {
			
			ans++;
			return;
		}
		
		for(int i = 0; i <n; i++) {
			
			if(!visited[i]) {
				
				visited[i]= true;
				bt(cnt+1,r_sum + choo[cnt],l_sum);
				
				visited[i] = false;
				
			}
			
			if(!visited[i]) {
				
				visited[i]= true;
			
				bt(cnt+1,r_sum,l_sum + choo[cnt]);
				visited[i] = false;
				
			}
			
		}
		
		
		
	}
	
	static void perm(int cnt) {
		
		if(cnt == n) {
			
			
			
			return;
		}
		
		
		for(int i = 0; i < n;i++) {
			if(!v2[i]) {
				v2[i] = true;
				a.add(choo[i]);
				perm(cnt+1);
				a.remove(cnt);
				v2[i] = false;
			}
			
		}
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= tt; t++) {
			
			
			n = Integer.parseInt(br.readLine());
			visited = new boolean[n+1];
			v2 = new boolean[n+1];
			choo = new int[n];
			ans = 0;
			a = new ArrayList<Integer>();
			
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i < n; i++) {
				choo[i] = Integer.parseInt(st.nextToken());			
			}
			
			bt(0,0,0);
			
			System.out.println("#" + t + " " + ans);
				
		}
		
	}
	
	

}
