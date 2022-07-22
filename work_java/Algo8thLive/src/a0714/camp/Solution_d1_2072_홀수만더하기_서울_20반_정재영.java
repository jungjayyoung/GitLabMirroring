//package a0714.camp;

import java.io.*;
import java.util.*;


public class Solution_d1_2072_홀수만더하기_서울_20반_정재영 {

	public static void main(String[] args) throws Exception{
		//System.setIn(new FileInputStream("res/input_d1_2072.txt"));

		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		
		
		for(int tc = 1; tc <= T; tc++){
			int ans = 0;
			for(int i = 1; i<=10;i++) {
				int num = sc.nextInt();
				
				if(num % 2 == 1) {
					ans += num;
				}
			}
			
			System.out.println(ans);
			
		}
		sc.close();
		
	}

}
