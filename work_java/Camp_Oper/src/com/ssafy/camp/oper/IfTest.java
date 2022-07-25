package com.ssafy.camp.oper;

import java.util.Random;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("i=");
		int i=sc.nextInt();
		
		//Random r=new Random();
		//int i=r.nextInt(10)+1;//(0,9)+1=(1,10)
		//System.out.println(i);
		
		//int i=10;
		if(i%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println(i%2==0? "짝":"홀");
		
		sc.close();
	}
}
