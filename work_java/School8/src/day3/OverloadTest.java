package day3;

public class OverloadTest {

	
//	public static void plus(int x,int y) {
//		System.out.println("public void plus(int " +x+ ",int "+y+ "=" + (x+y));
//	}
	
	protected static void plus(long x,int y) {
		System.out.println("public void plus(long " +x+ ",int "+y+ "=" + (x+y));
	}
	protected static void plus(long x,long y) {
		System.out.println("public void plus(long " +x+ ",long "+y+ "=" + (x+y));
	}
	
	static void plus(float x,float y) {
		System.out.println("public void plus(float " +x+ ",float "+y + "=" + (x+y));
	}
	
	static void plus(double x,double y) {
		System.out.println("public void plus(double " +x+ ",double "+y + "=" + (x+y));
	}
	public static void main(String[] args) {
		
		//static 변수 안에서는 static 메서드를 사용해야 한다.
		//아니면 객체를 만들어줘야 한다.
		plus(1,22);
		//plus(11L,22L);
		//plus(1.1f,2.2f);
		//plus(1.1,2.2);
		

	}

}
