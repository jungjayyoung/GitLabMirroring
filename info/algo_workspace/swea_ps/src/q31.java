import java.io.*;
import java.util.*;

public class q31 {
	
	static int [][]mine;
	static int n,m;
	static int dp[][];
	

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= tt; t++) {
			st = new StringTokenizer(br.readLine()," ");
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			mine = new int[n+1][m+1];
			dp = new int[n+1][m+1];
			st = new StringTokenizer(br.readLine()," ");
			for(int y = 0; y < n; y++) {
				
				for(int x = 0; x < m; x++) {
					mine[y][x] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int y = 0; y <n; y++) {
				dp[y][0] = mine[y][0];
			}
			
			for(int x = 1; x < m; x++) {
				
				for(int y = 0; y < n; y++) {
					if(y == 0) {
						dp[y][x] = Math.max(dp[y][x-1] , dp[y + 1][x - 1])+ mine[y][x];
					}else if(y == n -1) {
						dp[y][x] = Math.max(dp[y][x-1], dp[y - 1][x-1])+ mine[y][x];
					}else {
						dp[y][x] = Math.max(Math.max(dp[y + 1][x-1], dp[y][x-1]), dp[y - 1][x-1])+ mine[y][x];
					}
				}
				
			}
			int ans = -1;
			
			for(int y = 0; y <n; y++) {
				ans = Math.max(ans, dp[y][m-1]);
			}
			System.out.println(ans);
		}
	
		
	}

}
