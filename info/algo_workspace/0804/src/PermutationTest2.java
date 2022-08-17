import java.io.IOException;
import java.util.Scanner;

public class PermutationTest2 {
	
	static int N, R, totalCnt;
	static int[] numbers,input;
	static boolean[] isSelected;
	
	
	//nPn : n개의 입력받은 수 중 n개를 모두 뽑아 순서적으로 나열하는 것 (입력 수 1~ 100000) 
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		totalCnt = 0;
		
		input = new int[N];
		
		for(int i = 0; i <N; i++) {
			input[i] = sc.nextInt();
		}
		
		numbers = new int[R];
		isSelected = new boolean[N]; // 수가 1부터 시작해서 인덱스도 1부터 논리적 매칭 사용
		
		perm(0);
		System.out.println("전체 개수: " + totalCnt);
		
	}
	
	static void perm(int cnt) { //cnt: 직전까지 뽑은 순열에 포함된 수의 개수, cnt+1 해당하는 순열에 포함될 수를 뽑기
		
		if(cnt >= R) {
			
			totalCnt++;
			
			for(int i=0; i<R; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N; i++) {
			
			if(isSelected[i] || i < cnt) continue;
			
			isSelected[i] = true;
			numbers[cnt] = input[i];
			perm(cnt+1);
			isSelected[i] = false;
			
			
		}
		
	}

}
