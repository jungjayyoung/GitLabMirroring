package com.ssafy.camp.oper;

public class ForTest {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i==2) continue;
			if(i==4) break;
			System.out.println("i="+i);
		}
	}
}
