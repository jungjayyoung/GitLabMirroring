package com.ssafy.camp.oper;

import java.util.Scanner;

public class IfSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("점수=");
		int N=sc.nextInt();
		
		if(N>=90) {
			System.out.println("A");
		}else if(N>=80) {
			System.out.println("B");
		}else if(N>=70) {
			System.out.println("C");
		}else if(N>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		switch(N/10) {
			default:
				System.out.println('f');
				break;	
			case 10:
			case 9:
				System.out.println('a');
				break;
			case 8:
				System.out.println('b');
				break;				
			case 7:
				System.out.println('c');
				break;				
			case 6:
				System.out.println('d');
				break;		
		}
		
		sc.close();
	}
}
