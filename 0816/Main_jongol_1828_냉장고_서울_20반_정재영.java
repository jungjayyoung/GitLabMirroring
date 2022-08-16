package jol;

import java.io.*;
import java.util.*;


public class p1828 {
	
	static List<int[]> a = new ArrayList<int[]>();
	
	static class Cmp implements Comparator<int[]>{

		@Override
		public int compare(int[] o1, int[] o2) {
			
			return o1[1] - o2[1];
		}
		
		
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			a.add(new int[]{x,y});
			
		}
		
		Cmp cmp = new Cmp();
		
		Collections.sort(a,cmp);
		
		
		int end = a.get(0)[1];
		int cnt = 1;
		
		for(int i = 1; i <  a.size(); i++) {
			int cur[] = a.get(i);
			int cur_low = cur[0];
			int cur_high = cur[1];
			
			if(cur_low > end) {
				end = cur_high;
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}

}
