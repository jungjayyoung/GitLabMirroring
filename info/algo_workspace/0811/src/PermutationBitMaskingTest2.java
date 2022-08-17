import java.io.IOException;
import java.util.Scanner;

public class PermutationBitMaskingTest2 {
	
	static int N, R, totalCnt;
	static int[] numbers,input;
	
	
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
		
		perm(0,0);
		System.out.println("전체 개수: " + totalCnt);
		
	}
	//cnt: 직전까지 뽑은 순열에 포함된 수의 개수, cnt+1 해당하는 순열에 포함될 수를 뽑기
	// flag : 선택된 수들의 상태를 비트로 표현하고 있는 비트열 정수
	static void perm(int cnt,int flag) {
		if(cnt >= R) {
			
			totalCnt++;
			
			for(int i=0; i<R; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N; i++) {
			
			if( (flag & 1 << i) != 0) continue;
			
			numbers[cnt] = input[i];
			perm(cnt+1,flag | 1 << i );
			
			
		}
		
	}

}
