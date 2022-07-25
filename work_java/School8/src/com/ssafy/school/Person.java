package com.ssafy.school;

public class Person {

	private String name = "아무개";
	private int age;

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	public Person(String name) {
		this(name,99);
	}
	public Person() {
		this("모지리",99);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	private void checkAge(int age) {
		if(age < 1 || age > 99) {
			System.out.println("invalid age(1~99): " + age);
			System.exit(0);
		}else {
			this.age = age;			
		}
	}

	public void setAge(int age) {
		this.checkAge(age);
	}
	
	
	// 4-3 to-string
	@Override
	public String toString() {
		return getName()+ "\t" + getAge() + '\t';
	}
	
	
	public void printAll() {
		//3가지가 다 된다. 제일 짧은 this를 쓰자
		//System.out.println(this.toString());
		System.out.println(this);
		System.out.println(toString());
		
		
	}
	
	
	
	
	

}