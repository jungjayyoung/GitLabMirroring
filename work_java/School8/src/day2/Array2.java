package day2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		//1. 선언
		//int[][] a; // int a[][]; // int[] a[];
		
		
		//2. 생성
		//a= new int[3][3]; //new int[3][5]; //new int[3][];
		
		// 1+2,선언과 초기화를 한번에
		//int[][] a = new int[3][3];
		
		//3. 사용
		//a[0][-1]= -1; //ArrayIndexOutOfBoundsException
		//a[0][0] = 10;
		//a[1][1] = 11;
		//a[2][2] = 12;
		//a[0][3] = 13; //ArrayIndexOutOfBoundsException
		
		//4. 1+2+3
		//int[][] a= {{10, 0, 0},{0,11,0},{0,0,12}};
		//int[][] a= new int[][]{{10, 0, 0},{0,11,0},{0,0,12}};

		//5. 1, 2+3
		int [][] a;
		//a = {{10, 0, 0},{0,11,0},{0,0,12}}; // err
		a = new int[][] {{10},{0,11},{0,0,12}};
		
		//6. 출력
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		//a.length = 5; 상수는 값을 변경할 수 없다
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
			System.out.println("a["+i+"]["+j+"]="+a[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int[] ia : a) {
			for(int v : ia) {
				System.out.print(v+" ");
			}			
			System.out.println();
		}
		
	
		System.out.println();
		for(int[] ia: a) System.out.println(Arrays.toString(ia));
		System.out.println(Arrays.deepToString(a));
	}

}
