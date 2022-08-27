package boj;

import java.io.*;
import java.util.*;
		

public class p14890 {

	static int N, L;
	static int [][] board;
	static List<int[]> roads;
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		
		board = new int[N + 1][N + 1];
		
		for(int y = 0; y < N; y++) {
			
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x < N; x++) {
				board[y][x] = Integer.parseInt(st.nextToken());
				
				
			}
		}
		
		roads = new ArrayList<>();
		
		// 행, 열 모든  길들을 roads에 저장한다.
		for(int y = 0; y < N; y++) {
			int[] tmp = new int[N];
			for(int x = 0; x < N; x++) {
				tmp[x] = board[x][y];
			}
			roads.add(tmp);
			roads.add(board[y]);
		}
		
		int ans = 0;
		
		for(int[] road: roads) {
			
			if(check(road)) {
				ans++;
			}
			
		}
		
		System.out.println(ans);
		
		
	}
	
	static boolean check(int[] arr) {
		
		// 일단 높이 차이가 2 이상이면 안된다
		for(int i = 1; i < N; i++) {
			
			if(Math.abs(arr[i] - arr[i-1]) > 1) 
				return false;	
		}
		
		
		//첫 높이
		int cur = arr[0];
		int road_length = 1;
		
		for(int i = 1; i < N; i++) {
			
			
			// 현재 경사가 동일하다면 길이 증가
			if(arr[i] == cur) {
				road_length++;
				
				
			// 현재 경사가 높아진다면
			}else if(arr[i] > cur) {
				//경사로를 만들 길이가 안되면 false
				if(road_length < L) return false;
				//경사로를 만들 수 있으면 길이 1로 초기화하고
				// cur 업데이트
				road_length = 1;
				cur = arr[i];
				
			}else { // 경사가 낮아지면
				
				// 현재 arr[i] + d가 N을 넘거나
				// 중간에 경사가 동일하지 않은 땅을 만나면 false
				for(int d = 0; d < L;d++) {
					if(i + d >= N || arr[i] != arr[i + d]) return false;
				}
				
				i += L - 1;
				cur = arr[i];
				road_length = 0;
				
			}
			
			
		}
		
		return true;
		
	}

}
