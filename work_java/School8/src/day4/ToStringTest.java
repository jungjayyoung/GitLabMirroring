package day4;

import com.ssafy.school.*;

public class ToStringTest {

	public static void main(String[] args) {
		String s ="홍길동";
		System.out.println(s);
		System.out.println(s.toString());

		Person p = new Person("홍길동",20);
		System.out.println(p);
		System.out.println(p.toString());
	}

}
