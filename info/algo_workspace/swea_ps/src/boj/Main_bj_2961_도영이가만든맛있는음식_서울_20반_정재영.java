package boj;


import java.io.*;
import java.util.*;

public class Main_bj_2961_도영이가만든맛있는음식_서울_20반_정재영 {
	
	static int n;
	static List<Food> foods= new ArrayList<>();
	static boolean[] visited;
	static int ans = 1000000000;
	
	static class Food{
		int sour;
		int bitter;
		
		public Food(int sour, int bitter) {
			this.sour = sour;
			this.bitter =bitter;
			
		}
		
	}
	
	static void bt(int cnt) {
		
		if(cnt == n) {
			
			int s_max = 1;
			int b_max = 0;
			int total = 0;
			boolean check = false;
			
			
			for(int i = 0; i < n; i++) {
				
				if(visited[i]) {
					s_max *= foods.get(i).sour;
					b_max += foods.get(i).bitter;
					check = true;
				}
				
			}
			
			if(!check) return;
			
			total = Math.abs(s_max - b_max);
			
			ans = Math.min(ans, total);
			
			return;
		}
		
		
		bt(cnt+1);
		
		visited[cnt] = true;
		
		bt(cnt+1);
		
		visited[cnt] = false;
		
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		visited = new boolean[n+1];
		
		for(int i = 0; i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int b = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			foods.add(new Food(b,s));
		}
		
		
		
		bt(0);
		
		System.out.println(ans);
		

	}

}
