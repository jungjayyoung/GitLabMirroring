package day1;

import java.io.*;
import java.util.*;
public class ScannerTest {

	public static void main(String[] args) throws Exception{
		//System.setIn(new FileInputStream);
		Scanner sc = new Scanner(System.in);
		
		//홍길동 20 3.14 A
		String name =sc.next();
		int age= sc.nextInt();
		double pi= sc.nextDouble();
		char ch = sc.next().charAt(0);
		System.out.println(name + " "+ age+" "+pi + " " + ch);
	
		//홍길동 20 3.14 A
		sc.nextLine();
		String s = sc.nextLine(); //엔터키 앞까지 읽는다.
	
		String[] sa=s.split(" ");
		name=sa[0];
		age =Integer.parseInt(sa[1]);
		pi= Double.parseDouble(sa[2]);
		ch = sa[3].charAt(0);
		System.out.println(name + " "+ age+" "+pi + " " + ch);
		
	}

}
