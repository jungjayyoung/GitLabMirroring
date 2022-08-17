package boj;

import java.io.*;
import java.util.*;

public class p14888 {
	static int[] op= new int[4];
	static int n;
	static int arr[];
	static int visited[];
	
	static int minn = 1000000001;
	static int maxx = -1000000001;
	
	static void bt(int idx, int sum) {
		
		if(idx >= n) {
			
			minn = Math.min(minn, sum);
			maxx = Math.max(maxx, sum);
			
			return;
		}
		
		
		
		
		
		
		
		
		for(int i = 0; i < 4; i++) {
			
			if(op[i] > 0) {
				
				op[i]--;
				if(i == 0) { // +
					bt(idx+1,sum + arr[idx]);
				}else if(i == 1) { // -
					bt(idx+1,sum - arr[idx]);
				}else if(i == 2) { // *
					bt(idx+1,sum * arr[idx]);
				}else if(i == 3) { // /
					bt(idx+1,sum / arr[idx]);
				}
				op[i]++;
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		visited = new int[n];

		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < 4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
		
		bt(1,arr[0]);
		
		System.out.println(maxx);
		System.out.println(minn);

	}

}
