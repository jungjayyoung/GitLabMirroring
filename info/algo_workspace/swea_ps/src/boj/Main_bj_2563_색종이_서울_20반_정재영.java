package boj;
import java.io.*;
import java.util.*;


public class Main_bj_2563_색종이_서울_20반_정재영 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int n = Integer.parseInt(br.readLine());
		int[][] board = new int[101][101];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int yy = y; yy < y + 10; yy++) {
				for(int xx = x; xx < x+ 10; xx++) {
					board[yy][xx] = 1;
				}
			}
			
		}
		
		int ans = 0;
		for(int yy = 0; yy < 101; yy++) {
			for(int xx = 0; xx < 101; xx++) {
				if(board[yy][xx] == 1) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		
		
	}

}
