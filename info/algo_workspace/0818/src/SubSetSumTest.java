import java.util.*;
import java.io.*;

// n개의 자연수를 입력받고 목표합이 주어지면 목표합에 해당하는 부분집합을 출력
public class SubSetSumTest {
	
	static int N, totalCnt,S;
	static int[] input;
	static boolean[] isSelected;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		input = new int[N+1];
		for(int i = 0; i < N;i++) {
			input[i] = sc.nextInt();
		}
		
		isSelected = new boolean[N+1];
		subset(0,0);
		System.out.println("총 경우의 수: " + totalCnt);

	}

	
	static void subset(int idx,int sum) {
		
		
		if(sum == S) {
			
			totalCnt++;
			for(int i = 0; i < N; i++) {
				if(isSelected[i])
					System.out.print(input[i] + "\t");
			}
			System.out.println();
			return;
		}
		
		
		if(sum > S) return;
		
		if(idx == N) return;
		
		//원소 선택
		isSelected[idx] = true;
		subset(idx + 1, sum + input[idx]);
		//원소 미선택
		isSelected[idx] = false;
		subset(idx + 1, sum);
		
	}
}
