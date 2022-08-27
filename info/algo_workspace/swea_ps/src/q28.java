import java.io.*;
import java.util.*;

public class q28 {

	static int n;
	static int [] arr;
	
	
	static int binary_search() {
		int start = 0;
		int end = n - 1;
		
		
		while(start <= end) {
			
			int mid = (start+end)/2;
			
			if(arr[mid] < mid) {
				start = mid + 1;
			}else if(arr[mid] > mid) {
				end = mid - 1;
			}else if(arr[mid] == mid) {
				
				return mid;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i <n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		System.out.println(binary_search());
		
		
		
	}

}
