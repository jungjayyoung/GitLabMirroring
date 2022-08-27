package boj;
import java.util.*;
import java.io.*;


public class p12015 {
	
	static int a[] = new int[1000001];
	
	static int lower_bound(int []arr,int target, int size) {
		
		int mid, start, end;
		start = 0; end = size -1;
		
		while(end > start) {
			
			mid = (end + start) / 2;
			if(arr[mid] >= target) {
				end = mid;
			}else {
				start = mid + 1;
			}
			
			return end;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
			
			
			
		}
		
		
	}

}