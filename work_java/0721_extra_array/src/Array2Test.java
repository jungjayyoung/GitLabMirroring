
public class Array2Test {

	// 다차원 뱌열
	// array of array
	public static void main(String[] args) {

		int[] students[] = new int[2][];
		students[0] = new int [3];
		
		
		// 데이터타입 변수명
		int[] scores = new int[3]; // 3개의 과목 점수
		students[0][0] = 100;
		students[0][1] = 96;
		students[0][2] = 92;
		
		students[1] = new int[] {100,90,85,80};
		
		print(students);
		
		
		
				
				
	}
	
	public static void print(int [][] arr) {
		for (int[] is : arr) {
			print(is);
			System.out.println("==========");
		}
	}
			
	public static void print(int[] arr) {
		for(int i : arr) { //배열, Iterable 타입의 모든 원소를 순회(read)
			System.out.println(i + '\t');
			
		}
	}

}
