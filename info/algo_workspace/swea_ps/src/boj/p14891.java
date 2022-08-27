package boj;

import java.io.*;
import java.util.*;

public class p14891 {

	static int [][] a;
	
	static void turn(int num,int dir) {
		
		// 반시계 방향
		if(dir == -1) {
			
			int tmp = a[num][0];
			for(int i = 0; i < 7; i++) {
				a[num][i] = a[num][i+1];
			}
			a[num][7] = tmp;
			
		// 시계 방향
		}else if(dir == 1) {
			int tmp = a[num][7];
			for(int i =7; i > 0; i--) {
				a[num][i] = a[num][i-1];
			}
			a[num][0] = tmp;
			
		}
	
	}
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		a = new int[4][8];
	
		
		for(int i = 0; i <4; i++) {
			String s = br.readLine();
			
			// 12 시 부터 시계방향으로 주어진다.
			for(int j = 0; j <8;j++) {
				a[i][j] = s.charAt(j) - '0';
			}
		}
		
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int num = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			num = num - 1;
			
			boolean check1 = false;
			boolean check2 = false;
			boolean check3 = false;
			
			// 왼쪽 닿는 부분 6, 오른쪽 닿는 부분 2
			if(num == 0) { ///////////////////////////////////////////   1번 톱니
				if(a[0][2] != a[1][6]) {
					check1 = true;
					if(a[1][2] != a[2][6]) {
						check2 = true;
						if(a[2][2] != a[3][6]) {
							check3 = true;
						}	
					}
				}
				turn(0,dir);
				if(check1)turn(1,-dir);
				if(check2)turn(2,dir);
				if(check3)turn(3,-dir);
			
			}else if(num == 1) {  ///////////////////////////////////////////   2번 톱니
				if(a[0][2] != a[1][6]) {
					check1 = true;
				}
				if(a[2][6] != a[1][2]) {
					check2 = true;
					if(a[3][6] != a[2][2]) {
						check3 = true;
					}
				}
				
				turn(1,dir);
				if(check1)turn(0,-dir);
				if(check2)turn(2,-dir);
				if(check3)turn(3,dir);
				
			}else if(num == 2) {		///////////////////////////////////////////   3번 톱니
				if(a[1][2] != a[2][6]) {
					check1 = true;
					if(a[1][6] != a[0][2]) {
						check2 = true;
					}
				}
				if(a[2][2] != a[3][6]) {
					check3 = true;
				}
				
				turn(2,dir);
				if(check1)turn(1, -dir);
				if(check2)turn(0,dir);
				if(check3)turn(3,-dir);
				
			}else if(num == 3) {			/////////////////////////////////////////// 4번 톱니
				
				if(a[3][6] != a[2][2]) {
					check1 = true;
					if(a[2][6] != a[1][2]) {
						check2 = true;
						if(a[1][6] != a[0][2]) {
							check3 = true;
						}
					}
				}
				
				turn(3,dir);
				if(check1)turn(2,-dir);
				if(check2)turn(1,dir);
				if(check3)turn(0,-dir);
				
			}
		
		}
		////////// 회전 끝
		int sum = 0;
		for(int i = 0; i <4; i++) {
			if(i == 0 && a[i][0] == 1) {
				sum += 1;
			}else if(i == 1 && a[i][0] == 1) {
				sum += 2;
			}else if(i == 2 && a[i][0] == 1) {
				sum += 4;
			}else if(i == 3 && a[i][0] == 1) {
				sum += 8;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
