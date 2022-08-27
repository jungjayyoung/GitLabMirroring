package swea_ps;

import java.io.*;
import java.util.*;

public class test9299 {
	
	
	static int[] snack;
	static int[] s = new int [2];
	static int n,m;
	static int ans = -1;
	
	static void bt(int cnt,int start) {
		
		if(cnt == 2) {
			int sum = s[0] + s[1];
			if(sum <= m) {
				ans = Math.max(ans, sum);
			}
			
			return;
		}
		
		for(int i = start; i <n; i++) {
			
			s[cnt] = snack[i];
			bt(cnt+1,i + 1);
			
		}
		
		
		
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			snack = new int[n];
			
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < n; j++) {
				snack[j] = Integer.parseInt(st.nextToken());
			}
			ans = -1;
			
			bt(0,0);
			
			
			
			System.out.println("#" + i + " " + ans);
			
		
		}
		
		
		
		
		
		

	}

}
