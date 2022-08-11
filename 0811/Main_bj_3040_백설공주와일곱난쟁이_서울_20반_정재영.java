package boj;

import java.io.*;
import java.util.*;


public class Main_bj_3040_백설공주와일곱난쟁이_서울_20반_정재영 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i <9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		sum = sum - 100;
		int a,b;
		
		for(int i = 0; i <8; i++) {
			
			for(int j = i + 1; j<9;j++) {
				
				if(arr[i] + arr[j] == sum) {
					
					for(int k = 0; k <9;k++) {
						if(k == i || k == j)
							continue;
						System.out.println(arr[k]);
					}
					
					br.close();
					System.exit(0);
				}
			}
		}
		
	}

}
