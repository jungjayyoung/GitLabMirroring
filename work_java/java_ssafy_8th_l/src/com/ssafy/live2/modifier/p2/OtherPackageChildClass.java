package com.ssafy.live2.modifier.p2;

import com.ssafy.live2.modifier.p1.Parent;
//TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
 public class OtherPackageChildClass extends Parent{
	 
	 
	 public void method() {
		    // TODO: Parent 객체를 생성하고 이를 통해서 Parent의 멤버에 접근해보세요.
			//Parent p1 = new Parent();
			this.publicVar = 10;
			this.protectVar = 10;
			//this.defaultVar = 10;
			//this.privVar = 10;
			// END:
		}
	 
    // END:
}
