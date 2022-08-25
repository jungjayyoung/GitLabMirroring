package boj;

import java.io.*;
import java.util.*;

public class p10971 {
	static int n;
	
	static int[][] arr;
	static int visited[];
	static int ans = Integer.MAX_VALUE;
	
	static void bt(int pre, int cnt,int sum,int start) {
		
		if(cnt == n) {
			
			if(arr[pre][start] == 0) return;
			
			ans = Math.min(ans, sum + arr[pre][start]);
			
			return;
		}
		
		for(int i = 0; i < n; i++) {
			
			if(visited[i] == 0) {
				
				if(pre == -1) {
					
					visited[i] = 1;
					bt(i,cnt+1,sum + arr[i][i],i);
				}else {
					if(arr[pre][i] == 0) continue;
					
					visited[i] = 1;
					bt(i,cnt+1,sum + arr[pre][i],start);
				}
				visited[i] = 0;
			}
			
		}
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		visited = new int[n];
		
		for(int y = 0; y < n; y++) {
			
			st = new StringTokenizer(br.readLine()," ");
			for(int x = 0; x <n;x++) {
				arr[y][x] = Integer.parseInt(st.nextToken());
			}
		}
		
		bt(-1,0,0,-1);
		
		System.out.println(ans);
	}

}
