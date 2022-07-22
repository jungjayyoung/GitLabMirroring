package day3;

import com.ssafy.school.Student;

public class EqualsTest {

	public static void main(String[] args) {
		String t1 = new String("홍길동");
		String t2 = new String("홍길동");
		System.out.println(t1.equals(t2));

		System.out.println();
		
		Student s1 = new Student("홍길동",21,202201);
		Student s2 = new Student("홍길동",21,202201);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); //자동으로 object 클래스로 상속이 되서 equals가 된다.
		
	}

}
