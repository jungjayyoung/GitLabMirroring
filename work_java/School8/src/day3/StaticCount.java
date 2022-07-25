package day3;


class Count{
	
	public static int si; //static 멤버변수
	public		  int ii; // 
	
	
	static {
		si = 1;
	}
	
	public static int getSi() {
		return si;
	}
	static {
		si = 2;
	}
	
	
}
public class StaticCount {

	public static void main(String[] args) {
		

		System.out.println(Count.si);
		System.out.println(Count.getSi());
		//System.out.println(Count.ii); 인스턴스 변수,this, super 와 같은 non static 변수는 사용불가.
		
		Count c1 = new Count(); // 인스턴스를 할당해야 쓸 수 있다.
		
	
		c1.si++;
		// static 변수는 모든 인스턴스가 공유한다.
		// 인스턴스 변수를 생성하지 않고 클래스 만으로 사용라기 위해 사용한다.
		System.out.println(c1.ii); // 0
		System.out.println(c1.si); // 3
		System.out.println(c1.getSi()); // 3
		System.out.println(Count.getSi()); // 3
		System.out.println(Count.si); // 3
		
		Count c2 = new Count(); // 인스턴스를 할당해야 쓸 수 있다.
		
		
		c2.si++;
		
		System.out.println();
		System.out.println(c2.ii); // 0
		System.out.println(c2.si); // 4
		System.out.println(c2.getSi()); // 4
		System.out.println(Count.getSi()); // 4
		System.out.println(Count.si); // 4
		
		System.out.println();
		System.out.println(c1.ii); // 0
		System.out.println(c1.si); // 4
	}

}
