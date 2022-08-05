package bj;

import java.io.*;
import java.util.*;

public class Main_bj_2023_신기한소수_서울_20반_정재영 {

	static int N;
	static boolean[] visited = new boolean[10];
	static int nums[] = {1,2,3,5,7,9}; 
	
	// 소수 판정하는 함수
	static boolean is_prime(int number) {
		
		if(number == 1) return false;
		
		int end = (int)Math.sqrt(number);
		for(int i = 2; i <= end; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	// 백트레킹
	static void bt(int cnt,String str) { // cnt: 현재 집어넣는 문자열의 인덱스
		if(cnt == N) {
			
			System.out.println(str);
			return;
		}
		
		for(int i = 0; i<6;i++) {
			
			// 임시 문자열 변수 tmp
			String tmp = str;
			tmp = tmp + (char)(nums[i] +'0');
			
			// 문자열 변수를 Integer.parseInt를 통해 다시 정수로 바꿔준 다음에 is_prime 함수를 통해 소수인지 체크한다.
			if(!is_prime(Integer.parseInt(tmp))) continue;
			bt(cnt + 1, tmp);
		}
		
		
	}
	

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		bt(0,"");

	}

}
