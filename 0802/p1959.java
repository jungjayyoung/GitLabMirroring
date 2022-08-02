package p1959;

import java.util.Scanner;

public class p1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		
		for(int i=1; i<=tc;i++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int num_size = Math.max(n, m);
			int [] a = new int [n];
			int [] b = new int [m];
			
			for(int j=0;j<n;j++) {
				int num;
				num = sc.nextInt();
				a[j] = num;
				
			}
			
			for(int j=0;j<m;j++) {
				int num;
				num = sc.nextInt();
				b[j] = num;
			}
			
			
			int ans = -1;
			int min_num = Math.min(n, m);
			int [] min_arr;
			int [] max_arr;
	
			if(min_num == n) {
				min_arr = a;
				max_arr = b;
			}else {
				min_arr = b;
				max_arr = a;
			}
			
			for(int j = 0; j<=num_size - min_num;j++) {
				int sum = 0;
				for(int k = 0; k < min_num; k++) {
					sum += min_arr[k] * max_arr[j + k];			
				}

				ans = Math.max(ans, sum);
			}
			
			System.out.println("#"+ tc + " " + ans);
			
		}

	}

}
