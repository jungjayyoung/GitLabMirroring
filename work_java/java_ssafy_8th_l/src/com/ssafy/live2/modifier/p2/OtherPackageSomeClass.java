package com.ssafy.live2.modifier.p2;

import com.ssafy.live2.modifier.p1.Parent;

public class OtherPackageSomeClass {
    public void method() {
    	Parent p = new Parent();
		p.publicVar = 10;
		p.protectVar = 10;
		p.defaultVar = 10;
		//p.privVar = 10;
		// END:
    }
}
