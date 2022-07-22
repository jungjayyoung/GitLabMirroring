package com.ssafy.school;

public class Student extends Person {

	private int stuid;


	
	public Student(String name, int age, int stuid) {
		super(name,age);
		setStuid(stuid);
	}
	public Student(String name, int stuid) {
		this(name,99,stuid);
	
	}
	public Student(String name) {
		this(name,99,202299);
	
	}
	
	
	//디폴트 생성자
	public Student() {
		this("모지리");
	}
	


	public int getStuid() {
		return stuid;
	}


	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	
	@Override
	public String toString() {
		return super.toString()+ getStuid();
	}
//	@Override
//	public void printAll() {
//		System.out.println(this);
//	
//	}
	
}
