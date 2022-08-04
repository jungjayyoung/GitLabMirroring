import java.io.*;
import java.util.*;


public class p2001 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int tc = Integer.parseInt(bf.readLine());
		
		for(int t = 1; t<=tc; t++) {
			
			st = new StringTokenizer(bf.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			
			int [][] board = new int [n][n];
			
			for(int y = 0; y< n; y++) {
				
				st = new StringTokenizer(bf.readLine(), " ");
				
				for(int x = 0; x < n; x++) {
					board[y][x] = Integer.parseInt(st.nextToken());
				}
			}
			int ans = 0;
			
			for(int y = 0; y <= n-m; y++) {
				
				for(int x = 0; x <= n-m; x++) {
					int sum = 0;
					
					for(int i = y; i < y+ m; i++) {
						
						for(int j = x; j < x +m; j++) {
							
							sum += board[i][j];
							
						}
					}
					ans = Math.max(ans, sum);
				}
			}
			
			
			System.out.println("#" + t + " " + ans);
			
			
			
		}
	}

}
