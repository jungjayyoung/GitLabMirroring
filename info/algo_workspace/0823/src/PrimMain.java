import java.io.*;
import java.util.*;

public class PrimMain {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] g = new int[N][N];
		boolean[] v = new boolean[N];
		int[] minEdge = new int[N];
		
		for(int i=0; i<N; i++) {
		
			for(int j = 0; j < N; j++) {
				g[i][j] =sc.nextInt();
			}
			minEdge[i] = Integer.MAX_VALUE;
		}
		
		int result = 0, cnt = 0;
		minEdge[0]=0;
		System.out.println(Arrays.toString(minEdge));System.out.println();
		for(int i = 0; i <N; i++) {
			int min = Integer.MAX_VALUE;
			int minVertax = -1;
			
			for(int j =0; j <N; j++) {
				if(!v[j] && min > minEdge[j]) {
							min = minEdge[j];
							minVertax = j;
				}
			}
			
			v[minVertax] = true;
			result += min;
			System.out.println("min: " + min);
			System.out.println("minVertax: " + minVertax);
			System.out.println("result: " + result);
			System.out.println(Arrays.toString(v));
			if(cnt++ == N - 1) break;
			
			for(int j = 0; j <N; j++) {
				if(!v[j] && g[minVertax][j] != 0 && minEdge[j] > g[minVertax][j]) {
					minEdge[j] = g[minVertax][j];
				}
			}
			System.out.println(Arrays.toString(minEdge));System.out.println();
			
		}
		
		System.out.println(result);
		sc.close();

	}

}
