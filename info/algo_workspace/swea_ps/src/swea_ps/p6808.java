package swea_ps;

import java.io.*;
import java.util.*;

public class p6808 {
	static int[] cards; // 규영이 카드
	static int[] visited;
	static int[] nums; // 인영이 카드
	static int[] v;
	static int win_cnt;
	static int lose_cnt;

	
	
	
	static void bt(int cnt,int sum1,int sum2) {
		
		if(cnt == 9) {
			
			if(sum1 > sum2) {
				win_cnt++;
			}else if(sum1 < sum2) {
				lose_cnt++;
			}
			
			return;
		}
		
		
		for(int i = 0; i < 9; i++) {
			
			if(v[i] == 0) {
				v[i] = 1;
				
				if(cards[cnt] > nums[i]) {
					bt(cnt+1,sum1 + cards[cnt] +nums[i],sum2);
				}else {
					bt(cnt+1, sum1, sum2+ cards[cnt] +nums[i]);
					
				}
				v[i] = 0;
				
			}
			
			
		}
		
		
		
		
	}
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tt = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= tt; t++) {
			
			cards = new int[9];
			visited = new int[19];
			nums = new int[9];
			v = new int[9];
			win_cnt = 0;
			lose_cnt = 0;
			
			st = new StringTokenizer(br.readLine()," ");
			
			for(int i = 0; i <9; i++) {
				cards[i] = Integer.parseInt(st.nextToken());
				visited[cards[i]] = 1;
			}
			int idx = 0;
			
			//인영이 카드 배열
			for(int i = 1; i<=18;i++) {
				if(visited[i] == 0) {
					nums[idx++] = i;
				}
			}
			
			bt(0,0,0);
			
			System.out.println("#" + t + " " + win_cnt + " " + lose_cnt);
			
		}
		
	}

}
