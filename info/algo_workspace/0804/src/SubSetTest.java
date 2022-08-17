import java.util.Scanner;

//n 개의 수를 입력받고 가능한 모든 부분집합 생성
public class SubSetTest {

	static int N,totalCount;
	static int[] input;
	static boolean[] isSelected;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		totalCount = 0;
		input = new int[N];
		isSelected = new boolean[N];
		
		
		for(int i=0; i <N; i++) {
			input[i] = sc.nextInt();
		}
		
		
		subset(0);
		System.out.println(totalCount);
	}
	
	
	
	private static void subset(int index) { //index: 부분집합에 고려할 대상
		
		if(index == N) { // 더이상 고려할 원소가 없다면 부분집합의 구성이 완성
			totalCount++;
			for(int i = 0; i <N;i++) {
				System.out.print(isSelected[i]?input[i]:"X");
				System.out.print("\t");
			}
			
			System.out.println();
			
			return;
		}
		
		//원소 선택
		isSelected[index] = true;
		subset(index + 1);
		
		//원소 미선택
		isSelected[index] = false;
		subset(index + 1);
		
		
	}
	
	
	
	
	
	
	

}
