package boj;

import java.io.*;
import java.util.*;

public class p17140 {
	
	static int r,c,k;
	static int[][] arr;
	static List<int[]> list;
	static int[] num = new int[101];

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[4][4];
		
		for(int y = 1; y <= 3; y++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 1; x <= 3; x++) {
				arr[y][x] = Integer.parseInt(st.nextToken());
			}
		}
		
		int second = 0;
		int cur_row = 3;
		int cur_col = 3;
		list = new ArrayList<int[]>();
		while(true) {
			
			if(arr[r][c] == k) {
				System.out.println(second);
				break;
			}else if(second > 100) {
				System.out.println(-1);
				break;
			}
			
			if(cur_row >= cur_col) {
				for(int y = 1; y <= cur_row; y++) {
					for(int x = 1; x <= cur_col; x++) {
						num[arr[y][x]]++;
					}
				}
				
				
			}else if(cur_row < cur_col) {
				
				
				
			}
			
			
			
			
			
			
			second++;
		}
		
		
		
		
		
		
		

	}

}