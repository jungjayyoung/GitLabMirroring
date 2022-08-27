package swea_ps;
import java.io.*;
import java.util.*;

public class p2819 {
	static int n;
	static int []dx = {-1,0,1,0};
	static int []dy = {0,1,0,-1};
	static Set<Integer> h;
	static int [][]board;
	
	static void dfs(int x, int y,int cnt,int pre) {
		
		
		if(cnt == 6) {
			h.add(pre);
			return;
		}
		for(int i = 0; i <4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx < 0 || nexty < 0 || nextx >= 4 || nexty >= 4) continue;
			
			dfs(nextx,nexty,cnt+1,pre*10 + board[nexty][nextx]);
			
		}
		
		
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int ttt = 1; ttt <= tt; ttt++) {
			
			
			board = new int[4][4];
			h = new HashSet<>();
			
			
			for(int y = 0; y < 4; y++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int x = 0; x < 4; x++) {
					board[y][x] = Integer.parseInt(st.nextToken());
				}
			}
			
			
			for(int y = 0; y <4; y++) {
				
				for(int x = 0; x <4; x++) {
					
					dfs(x,y,0,board[y][x]);
				}
			}
			
			System.out.println("#" + ttt + " " + h.size());
			
			
			
		}
	}

}