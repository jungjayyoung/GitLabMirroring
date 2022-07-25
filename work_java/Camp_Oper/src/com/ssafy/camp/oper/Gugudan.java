package com.ssafy.camp.oper;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("단(2~9)? ");
		int dan=sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=dan; j++) {
				System.out.print(j+"x"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
/*
단(2~9)? 4
2x1=2	3x1=3	4x1=4
:		:		:
2x9=18	3x9=27	4x9=36
*/




