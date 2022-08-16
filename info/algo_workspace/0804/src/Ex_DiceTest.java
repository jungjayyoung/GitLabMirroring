import java.util.Arrays;
import java.util.Scanner;

public class Ex_DiceTest {

	static int N;
	static int totalCnt;
	static int [] num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int mode = sc.nextInt();
		totalCnt = 0;
		
		switch (mode) {
		
		case 1:
			num = new int[N];
			dice1(0);
			break;
		case 2:
			num = new int[N];
			visited = new boolean[7];
			dice2(0);
			
			break;
		case 3:
			num = new int[N];
			dice3(0,1);
			break;
		case 4:
			num = new int[N];
			dice4(0,1);
			break;
		}
		
		
		System.out.println(totalCnt);
		

	}
	
	
	
	
	//주사위 던지기 1 : 중복 순열
	private static void dice1(int cnt) {
		
		if(cnt >= N) {
			
			totalCnt++;
			for(int i=0; i<N;i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			
			return;
		}
		
		for(int i = 1; i<=6;i++) {
			
			num[cnt] = i;
			dice1(cnt+1);
			
		}
	}
	
	static boolean [] visited;
	//주사위 던지기 2 : 순열
	private static void dice2(int cnt) {
		
		if(cnt >= N) {
			
			totalCnt++;
			for(int i=0; i<N;i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			
			return;
		}
		
		for(int i = 1; i<=6;i++) {
			if(visited[i]) continue;
			
			visited[i] = true;
			num[cnt] = i;
			dice2(cnt+1);
			visited[i] = false;
			
		}
	}
	
	
		//주사위 던지기 3 : 중복 조합
		private static void dice3(int cnt,int start) {
		
			if(cnt >= N) {
				totalCnt++;
				System.out.println(Arrays.toString(num));
				
				return;
			}
			
			for(int i = start; i <=6; i++) {
				
				
				num[cnt] = i;
				dice3(cnt+1,i);
				
			}
		}
		
		//주사위 던지기 4 :  조합
		private static void dice4(int cnt,int start) {
			if(cnt >= N) {
				totalCnt++;
				System.out.println(Arrays.toString(num));
				
				return;
			}
			
			for(int i = start; i <=6; i++) {
				
				num[cnt] = i;
				dice4(cnt+1,i+1);
				
			}
		}

}
