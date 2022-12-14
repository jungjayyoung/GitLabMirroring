package boj;

import java.io.*;
import java.util.*;

public class p1697 {
	static int n, k;
	static int ans = 123456789;
	static boolean visited[] = new boolean[100001];
	
	static void bfs() {
		
		Queue<int[]> q = new ArrayDeque<>();
		
		q.offer(new int[] {n,0});
		visited[n] = true;
		
		while(!q.isEmpty()) {
			
			int tmp[] = q.poll();
			int cur = tmp[0];
			int second = tmp[1];
			
			visited[cur] = true;
			
			if(cur == k) {
				ans = Math.min(ans, second);
			
			}
			
			//1. x + 1 로 이동
			if(cur + 1 <= 100000 && !visited[cur + 1]) {
				q.offer(new int[] {cur+1,second + 1});
			}
			
			//2. x - 1 로 이동
			if(cur - 1 > 0 && !visited[cur - 1]) {
				q.offer(new int[] {cur-1,second + 1});
			}
			
			
			//3. 2 * x 로 이동
			if(cur != 0 && cur * 2 <= 100000 && !visited[cur * 2]) {
				q.offer(new int[] {cur * 2,second + 1});
			}
			
			
		}
		
	}

	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		bfs();
		
		System.out.println(ans);
		

	}

}
