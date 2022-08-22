package swea_ps;
import java.io.*;
import java.util.*;


public class Solution_d3_4012_요리사_서울_20반_정재영 {

	static int[][] board;
	static boolean[] visited; 
	static List<Integer> chosen; 
	static int[] ans;
	static int minn = 987654321;
	static int len;
	static int n;
	
	
	
	
	static void bt(int idx) {
		
		
		if(idx >= len + 1) {
			int food1 = 0;
			int food2 = 0;
			
			for(int i = 1; i<=n; i++) {
				
				for(int j = 1; j <=n;j++) {
					
					if(visited[i] == true && visited[j] == true) {
						food1 = board[i][j] + board[j][i];
					}
					
					if(visited[i] == false && visited[j] == false) {
						food2 = board[i][j] + board[j][i];
					}
					
				}
			}
			minn = Math.min(minn, Math.abs(food1 - food2));
			
			return;
		}
		
		for(int i = 1; i<=n; i++) {
			
			if(idx >= 2 && ans[idx - 1] > i) continue;
			if(visited[i] == false) {
				visited[i] = true;
				ans[idx] = i;
				bt(idx + 1);
				visited[i] = false;
			}
		}
	
	}
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= tt; t++) {
			
		
			chosen = new ArrayList<Integer>();
			minn = 987654321;
			
			n = Integer.parseInt(br.readLine());
			board = new int[n+1][n+1];
			visited = new boolean[n+1];
			ans = new int[n+1];

			len = n /2;
			for(int  y = 1; y <= n;y++) {
				st = new StringTokenizer(br.readLine()," ");

				for(int x = 1; x <= n; x++) {
					
					board[y][x] = Integer.parseInt(st.nextToken());
				}
			}
			
			bt(1);
			
			

			
			System.out.println("#" + t +" " +minn);
		
		}
		
	}

}
