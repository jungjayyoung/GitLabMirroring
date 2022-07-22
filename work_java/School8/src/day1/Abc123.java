package day1;

public class Abc123 {

	public static void main(String[] args) {
/*
1
2 3
4 5 6
7 8 9 10
출력
 */
		int N = 1;
		
		for(int i = 0; i<4;i++) {
			
			for(int j = 4 - i; j <= 4; j++) {
				System.out.printf("%3d",N++);
			}
			System.out.println();
		}
		
		
		
		char c = 'A';
		
		for(int i = 0; i<4;i++) {
			
			for(int j = 4 - i; j <= 4; j++) {
				System.out.printf("%3c",c++);
			}
			System.out.println();
		}

	}

}
