package day3;

public class StaticBlock {

	
	static int count;
	int ii =1;
	
	
	{
		System.out.println("{ }=" + ii);
		ii++;
	
	}
	
	StaticBlock(){
		System.out.println("StaticBlock()=" + ii);
		ii++;
	}
	
	static {
		System.out.println("count="+ count++);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		System.out.println(StaticBlock.count);
		System.out.println();
		
		StaticBlock s1 = new StaticBlock();
		System.out.println("s1.ii =" + s1.ii);
		System.out.println("s1.count =" + s1.count);
		System.out.println("StaticBlock.count =" + StaticBlock.count);
		
		System.out.println();
		System.out.println("main() end");
		

	}

}
