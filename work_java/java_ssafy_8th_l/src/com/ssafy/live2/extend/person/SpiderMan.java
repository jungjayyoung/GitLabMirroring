package com.ssafy.live2.extend.person;

public class SpiderMan extends Person{

	public boolean isSpider;
	public Spider spider = new Spider();
	
	
	
	public SpiderMan(String name, boolean isSpider) {
		super(name);
		this.isSpider = isSpider;
	}
	
	public void fireWeb() {
		if(isSpider) {
			// null pointer ==> null.XX
			spider.fireWeb();
		}else {
			System.out.println("사람일때는 참자");
		}
		
	}
	
	@Override
	public void jump() {
		if(isSpider) {
			spider.jump();
		}else {
			System.out.println("두다리로 힘껏 점프");
		}
	}
	
	@Deprecated
	public void love() {
		System.out.println("메리제인 사랑해!");
	}

	
	@Override
	public String toString() {
		return super.toString()+ ", isSpider: "+ this.isSpider;
	}
	
}
