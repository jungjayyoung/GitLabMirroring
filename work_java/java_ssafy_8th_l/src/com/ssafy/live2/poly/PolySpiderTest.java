package com.ssafy.live2.poly;

import com.ssafy.live2.extend.person.Person;
import com.ssafy.live2.extend.person.SpiderMan;

public class PolySpiderTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터 파크", true);
		
		// 다형성
		// 묵시적 형 변환
		SpiderMan sman2 = sman;
		Person person = sman;
		Object obj = person;

		
		// 명시적 형 변환
		SpiderMan reSpider = (SpiderMan)obj;
		reSpider.fireWeb();
		
		// 뭐든지 담을 수 있는 만능의 주머니.
		Object [] objs = new Object[4];
		objs[0] = sman;
		objs[1] = "Hello";
		objs[2] = objs;
		objs[3] = 1; // 기본형이었는데.. ㅜㅜ 왜 되지? --> autoboxing
		
		// 명시적 형변환 가능!
		SpiderMan fromObjArray = (SpiderMan)objs[0];
		fromObjArray.fireWeb();
		
		//objs[1] 번째 요소를 SpiderMan으로 쓰고 싶어하지만 문자열이기 때문에 컴파일 에러가 뜬다. 신텍스 에러는 아니다.
		// 문자열은 거미줄 발사 불가능!
		//그래서 만들어진게 instanceof 연산자로 형변환이 가능한지 여부를 알 수 있다.
		//SpiderMan fromobjArray2 = (SpiderMan)objs[1];
		//fromobjArray2.fireWeb();
		
		if(objs[1] instanceof SpiderMan) {
			SpiderMan fromobjArray2 = (SpiderMan)objs[1];
			fromobjArray2.fireWeb();
		}
		
		
		for(Object o: objs) {
			System.out.println(o.getClass().getName());
		}
		
		System.out.println(sman2);
		System.out.println(person);
		
		
	}

}
