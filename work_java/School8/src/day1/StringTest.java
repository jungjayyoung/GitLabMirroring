package day1;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "홍길동";
		String s2 = "홍길동";
		String t1 = new String("홍길동");
		String t2 = new String("홍길동");
		System.out.println(s1==s2);
		System.out.println(s1==t1);
		System.out.println(t1==t2);
		
		String s = "홍길동";
		s.concat("안녕!");
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("홍길동");
		sb.append("안녕");
		System.out.println(sb);
	}

}
