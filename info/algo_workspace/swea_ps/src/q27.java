import java.io.*;
import java.util.*;


public class q27 {
	
	static int n,x;
	static int []arr;
	static int lower_bound(int value) {
		
		int start = 0;
		int end = n - 1;
		int mid;
		
		while(start < end) {
			
			mid = (start + end) / 2;
			
			if(value <= arr[mid]) {
				end = mid;
			}else {
				
				start = mid + 1;
			}
			
			
		}
		
		return start;
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int idx = lower_bound(x);
		
		if(arr[idx] != x) {
			System.out.println(-1);
		}else {
			
			int cnt = 0;
			for(int i = idx; i < n; i++) {
				if(arr[i] == x) {
					cnt++;
				}else {
					
					break;
				}
			}
			System.out.println(cnt);
			
		}
		
		
		
	}

}
