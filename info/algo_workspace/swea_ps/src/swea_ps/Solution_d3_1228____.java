package swea_ps;

import java.io.*;
import java.util.*;


public class Solution_d3_1228____ {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		for(int i = 1; i<=1;i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			List<String> s = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j <n;j++) {
				s.add(st.nextToken());
			}
			
			int k = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j <k; j++) {
				String a = st.nextToken();
				
				List<String> order = new ArrayList<>();
				if(a.equals("I")) {
					
					order = new ArrayList<>();
				}
				
				int order_idx = Integer.parseInt(st.nextToken());
				int order_cnt = Integer.parseInt(st.nextToken());
				
				for(int ii = 0; ii < order_cnt;ii++) {
					String ss = st.nextToken();
					order.add(ss);
				}
				
				s.addAll(order_idx, order);
				
			}
			
			
			
			System.out.print("#" + i + " ");
			for(int j = 0; j < 10;j++) {
				System.out.print(s.get(j) + " ");
			}
			System.out.println();
			
			
			
			
			
		}
		
		
	}

}
