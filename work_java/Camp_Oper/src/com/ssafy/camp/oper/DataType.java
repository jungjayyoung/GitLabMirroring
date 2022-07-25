package com.ssafy.camp.oper;

public class DataType {
	public static void main(String[] args) {
		long var=100;// 100l, 100L
		float fvar=var;
		int kvar='A';
		// double<=float<=long<=int<=short<=byte
		//                         x char x
		
		int i=(int)123L;
		int j=(int)3.14; // 3.13f, 3.14F
		System.out.println(i+", "+j);
		
		// byte,short
		//byte b3=-129;
		byte b2=-128;
		byte b0=0; //-128 ~ 127
		byte b1=127;
		//byte b4=128;
	}
}
