package boj;

import java.io.*;
import java.util.*;

public class p3055 {

	static int r,c;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static char[][] board;
	static boolean[][]visited;
	static Deque<int []> dq = new ArrayDeque<int[]>();
	static boolean check = false;
	static int ans = 0;
	
	static void bfs() {
		code:while(!dq.isEmpty()) {
			
			int tmp[] = dq.pollFirst();
			
			int x = tmp[0]; // x좌표
			int y = tmp[1]; // y좌표
			int time = tmp[2]; // 이동횟수
			int is_gosem = tmp[3]; // 고슴도치면 1, 아니면 0
		
			for(int i = 0; i <4; i++) {
				int nextx = x + dx[i];
				int nexty = y + dy[i];
				
				if(nextx < 0 || nexty < 0 || nextx >= c || nexty >=r) continue;
				
				if(is_gosem == 1) {
					
					if(!visited[nexty][nextx] 
						&& (board[nexty][nextx] == '.' || board[nexty][nextx] == 'D')) {
						// 만약에 고슴도치가 비버굴로 들어 갈 수 있으면 
						// check = true 로 해주고 break
						if(board[nexty][nextx] == 'D') {
							check = true;
							ans = time + 1;
							break code;
						}
						visited[nexty][nextx] = true;
						dq.offer(new int[] {nextx,nexty,time + 1, is_gosem});
					}
					
				}else if(is_gosem == 0) {
					
					if(!visited[nexty][nextx] 
						&& board[nexty][nextx] == '.') {
						visited[nexty][nextx] = true;
						dq.offer(new int[] {nextx,nexty,time + 1, is_gosem});
					}		
				}		
			}	
		}	
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		board = new char[r+1][c+1];
		visited = new boolean[r+1][c+1];

		for(int y = 0; y < r; y++) {
			String s = br.readLine();
			for(int x = 0; x < c; x++) {
				board[y][x] = s.charAt(x);
				if(board[y][x] == 'S') {
					dq.offerLast(new int[] {x,y,0,1});
					visited[y][x] = true;
				}else if(board[y][x] == '*') {
					dq.offerFirst(new int[] {x,y,0,0});
					visited[y][x] = true;
				}
			}
		}

		bfs();  
		
		if(check) {
			System.out.println(ans);
		}else {
			System.out.println("KAKTUS");
		}
	
	}

}
