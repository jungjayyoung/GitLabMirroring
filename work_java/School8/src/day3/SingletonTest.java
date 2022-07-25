package day3;


class Singleton{
	
	// 2.
	private static Singleton instance = new Singleton();
	// 1. 생성자를 private으로 생성해서 외부에서는 생성자를 만들 수 없다
	private Singleton() {}
	
	// 3.
	public static Singleton getInstance() {
		return instance;
	}
}


public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		
		
	}
}
