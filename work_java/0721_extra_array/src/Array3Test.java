
public class Array3Test {

	// 다차원 뱌열
	// array of array
	public static void main(String[] args) {
		
		int[] students9[] = new int[2][];
		students9[0] = new int [3];
		
		
		students9[0][0] = 100;
		students9[0][1] = 96;
		students9[0][2] = 92;
		
		students9[1] = new int[] {100,90,85,80};
		
		int[][] students19 = {
				{100,70,95},
				{80,95,100},
				{96,94}
				
		};
		
		int [][] seoulClasses[] = new int[2][][];
		
		seoulClasses[0] = students9;
		seoulClasses[1] = students19;
		

		
		
		
		
		print(seoulClasses);
		
	}
	
	public static void print(int[][][] arr) {
		for (int[][] is : arr) {
			print(is);
			System.out.println("==========");
		}
		
	}

	public static void print(int [][] arr) {
		for (int[] is : arr) {
			print(is);
			
		}
	}
			
	public static void print(int[] arr) {
		for(int i : arr) { //배열, Iterable 타입의 모든 원소를 순회(read)
			System.out.println(i);
			
		}
	}

}
