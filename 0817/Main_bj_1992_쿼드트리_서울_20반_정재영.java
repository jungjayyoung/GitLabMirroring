package boj;
import java.io.*;
import java.util.*;

public class p1992 {
	
	static int n;
	static int board[][];
	
	static void solve(int x,int y,int size) {
		
		
		
		boolean zero_check = false;
		boolean one_check = false;
		
		for(int yy = y; yy < y + size; yy++) {
			
			for(int xx = x; xx < x + size; xx++) {
				
				if(board[yy][xx] == 0) {
					zero_check= true;
				}else {
					one_check = true;
				}
				
			}
		}
		
		if(!one_check && zero_check) {
			System.out.print(0);
			return;
		}else if(one_check && !zero_check) {
			System.out.print(1);
			return;
		}
		
		if(size == 1) {
			
			return;
		}
		
		// 괄 호를 만들어주고 0 과 1 이 둘 다 존재 한다면 분할을 해준다.
		
		if(one_check && zero_check) {
			System.out.print('(');
			solve(x,y,size/2);
			solve(x + size / 2, y,size/2);
			solve(x,y + size /2, size/2);
			solve(x + size / 2,y + size / 2,size/2);
			System.out.print(')');
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		
		n = Integer.parseInt(br.readLine());
		board = new int[n+1][n+1];
		
		for(int y = 0; y < n; y++) {
			
			String a = br.readLine();
			for(int x = 0; x < n; x++) {
				
				board[y][x] = a.charAt(x) - '0';
				
			}
		}
		
		
		solve(0,0,n);
		
		
		
		
		
		
	}

}
