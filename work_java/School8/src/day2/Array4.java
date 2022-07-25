package day2;

public class Array4 {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//8방 탐색 : 상,우상,우,우하,하,좌하,좌,좌상:23698741
		for(int i=0;i<a.length;i++) {
			for(int j=0;j <a.length;j++) {
				if(a[i][j] == 5) {
					System.out.println(a[i-1][j]);//상
					System.out.println(a[i-1][j+1]);//우상
					System.out.println(a[i][j+1]); //우
					System.out.println(a[i+1][j+1]);//우하
					System.out.println(a[i+1][j]);//하
					System.out.println(a[i+1][j-1]);//좌하
					System.out.println(a[i][j-1]);//좌
					System.out.println(a[i-1][j-1]); //좌상
					
					int[] di = {-1,-1,0,1,1,1,0,-1};
					int[] dj = {0,1,1,1,0,-1,-1,-1};
					for(int d=0; d<8;d++) {
						int ni = i +di[d];
						int nj = j +dj[d];
						System.out.println(a[ni][nj]);
					}
				}
			}
		}

	}
	
	
	
//	//1방 탐색
//			for(int i=0;i<a.length;i++) {
//				for(int j=0;j <a.length;j++) {
//					if(a[i][j] == 5) {
//						System.out.println(a[i][j]);
//						
//						int[] di = {0};
//						int[] dj = {0};
//						for(int d=0; d<1;d++) {
//							int ni = i +di[d];
//							int nj = j +dj[d];
//							System.out.println(a[ni][nj]);
//						}
//					}
//				}
//			}

	
//	//2방 탐색: 우좌:64
//			for(int i=0;i<a.length;i++) {
//				for(int j=0;j <a.length;j++) {
//					if(a[i][j] == 5) {
//						System.out.println(a[i][j+1]);
//						System.out.println(a[i][j-1]);
//						
//						int[] di = {0,0};
//						int[] dj = {1,-1};
//						for(int d=0; d<2;d++) {
//							int ni = i +di[d];
//							int nj = j +dj[d];
//							System.out.println(a[ni][nj]);
//						}
//					}
//				}
//			}
	
	
//	//2방 탐색: 상하:28
//			for(int i=0;i<a.length;i++) {
//				for(int j=0;j <a.length;j++) {
//					if(a[i][j] == 5) {
//						System.out.println(a[i+1][j]);
//						System.out.println(a[i-1][j]);
//						
//						int[] di = {1,-1};
//						int[] dj = {0,0};
//						for(int d=0; d<2;d++) {
//							int ni = i +di[d];
//							int nj = j +dj[d];
//							System.out.println(a[ni][nj]);
//						}
//					}
//				}
//			}
	
	
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
