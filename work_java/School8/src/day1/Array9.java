package day1;

import java.util.Arrays;

public class Array9 {

	static int[] di = {1,0,-1,0};
	static int[] dj = {0,1,0,-1};
	public static void main(String[] args) {
		int[][] a = {
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,9,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
		};
		int N = a.length;
		int M = a[0].length;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j <M;j++) {
				if(a[i][j] == 9) {
					
					for(int d=0; d<4;d++) {
						for(int k = 1; k<=3; k++) {
							int ni = i +di[d]*k;
							int nj = j +dj[d]*k;
							
							if(ni < 0 || ni >= N || nj < 0 || nj >= M)
								continue;
							a[ni][nj] = k;
							for(int[] b:a)System.out.println(Arrays.toString(b));
							System.out.println();
						}
						
					}
				}
			}
		}

		
		

	}
	
	

	
//	//4방 탐색: 상하좌우:2486
//			for(int i=0;i<a.length;i++) {
//				for(int j=0;j <a.length;j++) {
//					if(a[i][j] == 5) {
//						System.out.println(a[i][j-1]);//좌
//						System.out.println(a[i-1][j]);//상
//						System.out.println(a[i+1][j]);//하
//						System.out.println(a[i][j+1]); //우
//						
//						int[] di = {1,0,-1,0};
//						int[] dj = {0,1,0,-1};
//						for(int d=0; d<4;d++) {
//							int ni = i +di[d];
//							int nj = j +dj[d];
//							System.out.println(a[ni][nj]);
//						}
//					}
//				}
//			}
	
	
//	//4방 탐색: 우상우하좌하좌우:3971
//			for(int i=0;i<a.length;i++) {
//				for(int j=0;j <a.length;j++) {
//					if(a[i][j] == 5) {
//						System.out.println(a[i-1][j+1]);//우상
//						System.out.println(a[i+1][j+1]);//우하
//						System.out.println(a[i+1][j-1]);//좌하
//						System.out.println(a[i-1][j-1]); //좌상
//						
//						int[] di = {-1,1,1,-1};
//						int[] dj = {1,1,-1,-1};
//						for(int d=0; d<4;d++) {
//							int ni = i +di[d];
//							int nj = j +dj[d];
//							System.out.println(a[ni][nj]);
//						}
//					}
//				}
//			}
	
}
