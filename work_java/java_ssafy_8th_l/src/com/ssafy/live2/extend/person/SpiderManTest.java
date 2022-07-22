package com.ssafy.live2.extend.person;

public class SpiderManTest {

	@SuppressWarnings({"deprecation"})
	public static void main(String[] args) {
		
		SpiderMan sman = new SpiderMan("sdsd",true);
		sman.eat(); //person
		sman.jump(); // person
		sman.fireWeb(); //spiderman
		sman.isSpider = true;
		sman.eat(); //person
		sman.jump(); // person
		sman.fireWeb(); //spiderman
		sman.love();
		System.out.println(sman.toString());
		
	}
	
	
	

}
