package com.ssafy.school.test;

import com.ssafy.school.Employee;
import com.ssafy.school.Person;
import com.ssafy.school.Student;
import com.ssafy.school.Teacher;

public class SchoolTest {

	public static void main(String[] args) {
		
		
		Person p =null;
		//생성자 오버로딩
		p= new Student("홍길동",20,202201); //Constructor
		p.printAll();
		
		p = new Student("홍길순",202202); //Constructor
		p.printAll();
		
		p = new Student("나맹구"); //Constructor
		p.printAll();
		
		p = new Teacher("일강사",30,"자바");
		p.printAll();
//		p = new Teacher("일강사","알고");
//		p.printAll();
		p = new Teacher("삼강사");
		p.printAll();
		p = new Teacher();
		p.printAll();
		System.out.println();
		
		p = new Employee("일직원",25,'A');
		p.printAll();
		p = new Employee("이직원",'B');
		p.printAll();
		p = new Employee("삼직원");
		p.printAll();
		p = new Employee();
		p.printAll();
		
		
	}

}
