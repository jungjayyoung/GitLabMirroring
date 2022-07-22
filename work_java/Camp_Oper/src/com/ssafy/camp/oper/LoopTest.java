package com.ssafy.camp.oper;

public class LoopTest {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			System.out.print("i="+i+" ");
			i++;
		}
		System.out.println();
		
		for(int j=1; j<=5; j++) {
			System.out.print("j="+j+" ");
		}
		System.out.println();
		
		int k=1;
		do {
			System.out.print("k="+k+" ");
			k++;
		}while(k<=5);
	}
}
