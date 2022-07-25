package day1;

import java.util.Scanner;
import java.io.*;
public class CountTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int tc = sc.nextInt(); // 테스트 케이스 개수 입력
		
		while(tc-- > 0) {
			String s = sc.next();
			char[] chars = s.toCharArray();
			int [] num = {0,0,0,0,0,0,0,0,0,0};
			
			
			for(int i = 0; i< chars.length;i++) {
				
				num[chars[i] - '0']++;
			}
			
			System.out.printf("#%d ", 3- tc);
			for(int i = 0; i <num.length;i++) {
				System.out.printf("%d", num[i]);
			}
			System.out.println();
			
		}
		

	}

}
/*
3
123
1234567890
3725779281153
 *
 *
 #1 0111000000
 #2 1111111111
 #3 0222020311
 */
