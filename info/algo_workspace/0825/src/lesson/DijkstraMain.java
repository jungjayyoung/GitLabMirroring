package lesson;

import java.io.*;
import java.util.*;

public class DijkstraMain {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] g = new int[N][N];
		boolean[] v = new boolean[N];
		int[] dist = new int[N]; // 다익스트라
		
		for(int i=0; i<N; i++) {
		
			for(int j = 0; j < N; j++) {
				g[i][j] =sc.nextInt();
			}
			dist[i] = Integer.MAX_VALUE;
		}
		
		dist[0]=0;

		for(int i = 0; i <N; i++) {
			int min = Integer.MAX_VALUE;
			int minVertax = -1;
			
			for(int j =0; j <N; j++) {
				if(!v[j] && min > dist[j]) {
							min = dist[j];
							minVertax = j;
				}
			}
			
			v[minVertax] = true;
			if(minVertax == N - 1) break;
			
			for(int j = 0; j <N; j++) {
				if(!v[j] && g[minVertax][j] != 0 && dist[j] > min + g[minVertax][j]) {
													dist[j] = min + g[minVertax][j];
				}
			}

			
		}
		System.out.println(dist[N-1]);
		sc.close();

	}

}