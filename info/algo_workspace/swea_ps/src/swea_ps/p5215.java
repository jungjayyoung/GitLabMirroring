package swea_ps;

import java.io.*;
import java.util.*;


public class p5215 {
	
	public static class Hamburger{
		int score;
		int cal;	
		
		public Hamburger() {}
		
		public Hamburger(int score, int cal) {
			this.score = score;
			this.cal = cal;
		}

	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= tc; t++) {
			st =new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int [][] dp = new int[n + 1][l + 1];
			
			List<Hamburger> hamburger = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				st =new StringTokenizer(br.readLine()," ");
				int tt = Integer.parseInt(st.nextToken());
				int kk = Integer.parseInt(st.nextToken());
				hamburger.add(new Hamburger(tt,kk));
				
			}
			
			for(int i =1; i<=n;i++) {
				
				int cal = hamburger.get(i - 1).cal;
				int score = hamburger.get(i - 1).score;
				
				for(int j = 0; j<= l; j++) {
					
					if(cal > j) {
						dp[i][j] = dp[i - 1][j];
					}else {
						dp[i][j] = Math.max(dp[i - 1][j - cal] + score, dp[i-1][j]);
					}
					
				}
				
			}
			
			System.out.println("#" + t + " " + dp[n][l]);
			
		}
	}
	
	
	

}
