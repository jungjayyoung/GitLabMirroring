package boj;

import java.io.*;
import java.util.*;

public class p15686 {
	
	static int n, m;
	static int board[][];
	static List<int[]> a = new ArrayList<int[]>(); // 치킨집의 좌표들 저장
	static List<int[]> selected = new ArrayList<int[]>();
	static List<int[]> home = new ArrayList<int[]>();
	
	static int ans = Integer.MAX_VALUE;
	static int sum = 0;
	
	
	
	static void bt(int cnt,int start) {
		
		
		// m개의 치킨집을 고른다.
		if(selected.size() >= m) {
			sum = 0;
		
			for(int j = 0; j < home.size(); j++) {
				int h_x = home.get(j)[0];
				int h_y = home.get(j)[1];
				int tmp = 987654321;
				int distance;
				for(int i = 0; i < selected.size(); i++) {
					int c_x = selected.get(i)[0];
					int c_y = selected.get(i)[1];
					
					distance = Math.abs(h_x - c_x) + Math.abs(h_y - c_y);

					tmp = Math.min(distance, tmp);
					
				}
				
				sum += tmp;
			}
			
			ans = Math.min(ans, sum);
			
			return;
		}
		
		
		for(int i=start; i< a.size();i++) {
			
			int x = a.get(i)[0];
			int y = a.get(i)[1];

			selected.add(new int[] {x,y});
			bt(cnt +1, i + 1);
			selected.remove(cnt);
						
		}

	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n+1][n+1];
		
		for(int y =0; y < n; y++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x <n; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
				if(board[y][x] == 2) {
					a.add(new int[] {x,y});
				}else if(board[y][x] == 1) {
					home.add(new int[] {x,y});
				}
			}
			
		}
		
		bt(0,0);
		
		System.out.println(ans);
		
	}

}
