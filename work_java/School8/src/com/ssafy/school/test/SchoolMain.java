package com.ssafy.school.test;

import com.ssafy.school.Employee;
import com.ssafy.school.ManagerImpl;
import com.ssafy.school.Person;
import com.ssafy.school.Student;
import com.ssafy.school.Teacher;

public class SchoolMain {

	public static void main(String[] args) {
		
		
		ManagerImpl m = ManagerImpl.getInstance();
		
		m.add(new Student("홍길동",20,202201));
		m.add(new Teacher("일강사",20,"자바"));
		m.add(new Employee("일직원",20,'A'));
		m.printAll();
		System.out.println();
		
		Person p = m.search("일강사");
		p.printAll();
		System.out.println();
		
		
		p = new Student("일강사",30,202209);
		m.update(p);
		for(Person t:m.search()) t.printAll();
		System.out.println();
		
		m.delete("일강사");
		
		m.printAll();
		
		
		//5. 다형성 오버라이드
		
//		Person p =new Student("홍길동",20,202201);
//		p.setName("손오공");
//		p.setStuid(202288); // Person까지만 접근이 가능하다.
//		p.printAll(); // sub <- override <- inheritance
//		
		
		//4. 다형성리턴
		
//		Person get() {
//		
//			int get() {
//				//..
//				return new Student("홍길동",20,202201);
//				
//			}
//	
//		}
		
		// 3. 다형성 파라미터
		
		
//		void set(Object o) {
//			
//			
//		}
//		
//		void set(Person p) {
//			//void set(int i){
//			//...
//		//}
//			
//		}
//		void set(int i) {
//			//...
//		}
//		set(new Student("홍길동",20,202201)); //set(new Person("홍길동",20));
//		set('A'); //set(123);
		
		
		// 2. 다형성 배열
		
		//배열을 만들 때 super class 배열을 만든다.
		//상속관계에서 부모보다 자식의 크기가 작다.
		/*
		Object[] oa=new Object[3];
		oa[0] =123;
		int[] ia = new int[3];
		ia[0] = 'A';
		
		
		Person[] pa = new Person[3];
		pa[0] = new Student("홍길동",20,202201);
		pa[1] = new Teacher("일강사",30,"자바");
		pa[2] = new Employee("일직원",25,'A');
		for(Person p:pa) p.printAll();
		*/
		
//		// 1. 다형성 정의
		// 접근 지정자는 부모와 같거나 더 넓어야 하고
		// 파라미터 리스트는 같아야 하고 등등 까다로운 규칙이 있다.
//		Object o=123;
//		int i ='A';
//		float f =123L;
//		
		
//		Person p =new Student("홍길동",20,202201);
//		p.setName("손오공");
//		//p.setStuid(202288); // Person까지만 접근이 가능하다.
		// overriding은 파라미터의 타입,개수가 같아야 한다.
		// overloading은 달라야 한다.
//		p.printAll(); // sub <- override <- inheritance
//		
//		//Teacher t = (Teacher)p; 안된다 //ClassCastException
//		
//		if(p instanceof Student) {
//			Student s =(Student)p;
//			s.setStuid(202288);
//		}
//		
//		p.printAll();
//		System.out.println(p instanceof Student);
//		System.out.println(p instanceof Person);
//		System.out.println(p instanceof Object);
		
		

	}

}
