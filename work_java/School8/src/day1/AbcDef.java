package day1;

public class AbcDef {

	public static void main(String[] args) {

/*
 *      A
 *    B C D
    E F G H I
  J K L M N O P
Q R S T U V W X Y		 
 */
		
		char c = 'A';
		
		for(int i = 4; i>=0;i--) {
			
			for(int j = 0; j < i; j++) {
				System.out.printf("  ");
			}
			for(int j = i; j < (9-i); j++) {
				System.out.printf("%2c",c++);
			}
			System.out.println();
		}

		
		char cc = 'A';
		
		for(int i = 0; i<=4;i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.printf("  ");
			}
			for(int j = i; j < (9-i); j++) {
				System.out.printf("%2c",cc++);
			}
			System.out.println();
		}
	}

}
