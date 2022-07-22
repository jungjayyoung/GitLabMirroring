package com.ssafy.live1.basic;

public class BP_11 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        // TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
        // 산술연산의 최소 단위는 int 이다. 내부적으로 int로 바뀌어서 계산이 되기 때문에 byte에 계산결과가 들어갈 수 없다.
         byte b3 = b1 + b2;

        int i1 = 10;
        long l1 = 20;
        // TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
        //long을 int에 할당해줄 수 없다는 뜻이다. int와 long을 더하면 더 큰 자료형인 long 타입으로 변경되어 계산이 된다.
         int i2 = i1 + l1; 

        // TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
         // 실수는 기본형이 double이므로 float로 하려면 뒤에 f가 필요하다.
         // 마찬가지로 20.0은 double 형이므로 double은 float에 할당해줄 수 없으므로 에러가 난다.
         float f1 = 10.0; 
         float f2 = f1 + 20.0;
    }

}
