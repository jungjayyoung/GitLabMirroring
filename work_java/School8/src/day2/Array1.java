package day2;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		//1. 선언
		//int[] a; // int a[];
		
		//2. 생성
		//a= new int[3];
		// 1+2,선언과 초기화를 한번에
		//int[] a = new int[3];
		
		//3. 사용
		//ArrayIndexOutOfBoundsException
		//a[0] = 10;
		//a[1] = 11;
		//a[2] = 12;
		//a[0] = 13;
		
		//4. 1+2+3
		//int[] a= {10,11,12};
		//int[] a= new int[]{10,11,12};

		//5. 1, 2+3
		int [] a;
		//a = {10,11,12}; // err
		a = new int[] {10,11,12};
		
		//6. 출력
		System.out.println(a.length);
		
		//a.length = 5; 상수는 값을 변경할 수 없다
		for(int i=0; i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		
		System.out.println();
		
		for(int v : a) System.out.println(v);
		System.out.println();
		
		System.out.println(Arrays.toString(a));
	}

}
