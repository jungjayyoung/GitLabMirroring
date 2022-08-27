import java.io.IOException;
import java.util.Scanner;

public class CombinationTest {
	
	static int N, R, totalCnt;
	static int[] numbers,input;

	
	
	//nCn : n개의 입력받은 수 중 n개를 모두 뽑아 순서적으로 나열하는 것 (입력 수 1~ 100000) 
	//nCr : n개의 입력받은 수 중 r개를 모두 뽑아 순서 없이 나열한 것
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
		
		comb(0,0);
		System.out.println("전체 개수: " + totalCnt);
		
	}
	// cnt+1 해당하는 조합에 포함될 수를 뽑기
	static void comb(int cnt,int start) { //cnt: 직전까지 뽑은 조합에 포함된 수의 개수,  start: 시도할 수의 시작 위치
		
		if(cnt >= R) {
			
			totalCnt++;
			
			for(int i=0; i<R; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			return;
		}
		
		//start 부터 처리시 중복 수 추출방지 및 순서가 다른 조합 추출 방지
		for(int i=start; i<N; i++) {
			
			
			numbers[cnt] = input[i];
			comb(cnt+1,i + 1);
			
			
		}
		
	}

}
