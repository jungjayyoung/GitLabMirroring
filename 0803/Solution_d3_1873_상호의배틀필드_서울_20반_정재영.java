import java.io.*;
import java.util.*;


public class p1873 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tc = Integer.parseInt(bf.readLine());
		
		for(int t = 1; t<= tc; t++) {
			st = new StringTokenizer(bf.readLine(), " ");
			int h = Integer.parseInt(st.nextToken()); // y
			int w = Integer.parseInt(st.nextToken());  // x
			char [][] board = new char [h][w];
			
			int cur_x = -1;
			int cur_y = -1;
			// 게임판 입력
			for(int y = 0; y < h; y++) {
				
				String s = bf.readLine();
				
				for(int x = 0; x < w; x++) {
					board[y][x] = s.charAt(x);
					if(board[y][x] == '<' 
							|| board[y][x] == '^' 
							|| board[y][x] == 'v'
							|| board[y][x] == '>') {
						cur_x = x;
						cur_y = y;
					}
				}
			}
			
			int cnt = Integer.parseInt(bf.readLine());
			
			String s = bf.readLine();
			
			for(int i = 0; i<s.length();i++) {
				if(s.charAt(i) == 'U') {
					if(cur_y -1 >= 0 && board[cur_y - 1][cur_x] == '.') {
						board[cur_y -1][cur_x] = '^';
						board[cur_y][cur_x] = '.';
						cur_y = cur_y -1;
					}else {
						board[cur_y][cur_x] = '^';
					}
					
					
				}else if(s.charAt(i) == 'D') {
					if(cur_y + 1 < h && board[cur_y + 1][cur_x] == '.') {
						board[cur_y + 1][cur_x] = 'v';
						board[cur_y][cur_x] = '.';
						cur_y = cur_y + 1;
					}else {
						board[cur_y][cur_x] = 'v';
					}
					
				}else if(s.charAt(i) == 'L') {
					if(cur_x -1 >= 0 && board[cur_y][cur_x - 1] == '.') {
						board[cur_y][cur_x - 1] = '<';
						board[cur_y][cur_x] = '.';
						cur_x = cur_x -1;
					}else {
						board[cur_y][cur_x] = '<';
					}
					
				}else if(s.charAt(i) == 'R') {
					if(cur_x + 1 < w && board[cur_y][cur_x + 1] == '.') {
						board[cur_y][cur_x + 1] = '>';
						board[cur_y][cur_x] = '.';
						cur_x = cur_x + 1;
					}else {
						board[cur_y][cur_x] = '>';
					}
					
				}else if(s.charAt(i) == 'S') {
					
					if(board[cur_y][cur_x] == '>') {
						
						int bomb_x = cur_x;
						while(bomb_x < w && board[cur_y][bomb_x] != '*' && board[cur_y][bomb_x] != '#') {
							bomb_x++;
						}
						if(bomb_x < w) {
							if(board[cur_y][bomb_x] == '*') {
								board[cur_y][bomb_x] = '.';
							}
						}
						
					}else if(board[cur_y][cur_x] == '<') {
						int bomb_x = cur_x;
						while(bomb_x >= 0 && board[cur_y][bomb_x] != '*' && board[cur_y][bomb_x] != '#') {
							bomb_x--;
						}
						if(bomb_x >= 0) {
							if(board[cur_y][bomb_x] == '*') {
								board[cur_y][bomb_x] = '.';
							}
						}
						
						
					}else if(board[cur_y][cur_x] == '^') {
						int bomb_y = cur_y;
						while(bomb_y >= 0 && board[bomb_y][cur_x] != '*' && board[bomb_y][cur_x] != '#') {
							bomb_y--;
						}
						if(bomb_y >= 0) {
							if(board[bomb_y][cur_x] == '*') {
								board[bomb_y][cur_x] = '.';
							}
						}
						
					}else if(board[cur_y][cur_x] == 'v') {
						int bomb_y = cur_y;
						while(bomb_y < h && board[bomb_y][cur_x] != '*' && board[bomb_y][cur_x] != '#') {
							bomb_y++;
						}
						if(bomb_y < h) {
							if(board[bomb_y][cur_x] == '*') {
								board[bomb_y][cur_x] = '.';
							}
						}
						
					}
					
				}
				
				
				
				
			}
			
			
			System.out.print("#" + t + " ");
			for(int y =0; y < h; y++) {
				
				for(int x = 0; x < w; x++) {
					
					System.out.print(board[y][x]);
					
				}
				System.out.println();
			}
			
			
			
		}
		
		
		
	}

}
