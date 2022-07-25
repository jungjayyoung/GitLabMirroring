package com.ssafy.camp.oper;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		//1선언
		//int[] ia; //int ia[];
		
		//2생성
		//ia=new int[3]; 
		
		//1+2
		//int[] ia=new int[3];
		
		//3사용
		/*
		//ia[-1]=-1;//ArrayIndexOutOfBoundsException
		ia[0]=10;
		ia[1]=11;
		ia[2]=12;
		//ia[3]=13;//ArrayIndexOutOfBoundsException
		*/
		
		//1+2+3
		int[] ia={10,11,12};
		
		//출력
		//for(int i=0; i<ia.length; i++) {
		//	System.out.println("ia["+i+"]="+ia[i]);
		//}
		for(int a:ia) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(ia));
	}
}
