package com.ssafy.school;

public class Teacher extends Person{

	private String subj;
	
	
	public Teacher(String name, int age, String subj) {
		setName(name);
		setAge(age);
		setSubj(subj);
	}


	public Teacher(String name) {
		this(name,99,"무전공");
		
	}
	public Teacher() {
		this("모지리",99,"무전공");
		
	}
	
	
	public String getSubj() {
		return subj;
	}
	public void setSubj(String subj) {
		this.subj = subj;
	}
	
	@Override
	public String toString() {
		return super.toString()+ getSubj();
	}
	
//	@Override
//	public void printAll() {
//		System.out.println(getName()+ "\t" + getAge() + "\t" + getSubj());
//		
//	}
	
	
}
