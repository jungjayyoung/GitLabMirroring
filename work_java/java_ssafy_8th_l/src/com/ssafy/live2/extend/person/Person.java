package com.ssafy.live2.extend.person;

public class Person {
	
	public String name = "피터 파커";
	
	Person(String name){
		this.name = name;
	}
	
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	public void jump() {
		System.out.println("두 다리로 폴짝!!");
	}
	
	public void jump(String s) {
		System.out.println("두 다리로 폴짝!!");
	}

	public String toString() {
		
		return "person:, name: " + this.name;
	}

	
	

}
