package com.ssafy.school;

public class Employee extends Person{

	
	private char dept;
	
	
	public Employee(String name, int age, char dept) {
		super(name,age);
		setDept(dept);
	
	}
	public Employee(String name, char dept) {
		
		this(name,99,dept);
		
	}
	public Employee(String name) {
		this(name,99,'X');
	}
	public Employee() {
		
		this("모지리",99,'X');
		
	}
	
	public char getDept() {
		return dept;
	}
	public void setDept(char dept) {
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+ getDept();
	}
//	public void printAll() {
//		System.out.println(getName()+ "\t" + getAge() + "\t" + getDept());
//		
//	}
	
	
}
