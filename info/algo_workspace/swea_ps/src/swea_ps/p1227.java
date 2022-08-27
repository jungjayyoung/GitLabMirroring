package swea_ps;
import java.util.*;
import java.io.*;


public class p1227 {
	
	static int board[][];
	static int visited[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static boolean check = false;
	
	static void dfs(int x, int y) {
		
		visited[y][x] = 1;
		if(board[y][x] == 3) {
			
			check = true;
			return;
		}
		
		for(int i = 0; i <4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty < 0 || nextx >= 100 || nexty >= 100) continue;
			
			if(board[nexty][nextx] == 0 && visited[nexty][nextx] == 0 || board[nexty][nextx] == 3) {
				dfs(nextx,nexty);
			}
			
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		for(int tt = 1; tt<=1;tt++) {
			
			board = new int[101][101];
			visited = new int[101][101];
			
			int t = Integer.parseInt(br.readLine());
			
			
			for(int y = 0; y <100; y++) {
				String s = br.readLine();
				
				for(int x = 0; x< 100; x++) {
					board[y][x] = s.charAt(x) - '0';
				}
			}
			
			
			
			check = false;
			
			
			dfs(1,1);
			
			if(check) {
				System.out.println("#" + t + " " + 1);
			}else {
				System.out.println("#" + t + " " + 0);
			}
			
		}
		

	}

}
