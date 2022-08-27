

import java.util.*;
import java.io.*;


public class GraphListArray {
	
	
	static int N;
	static List<Integer>[] g;
	static boolean[] v;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int E = sc.nextInt();
		g = new List[N];
		
		
		// 2차원 초기화 꼭 추가해 줘야 널 포인터가  안 나온다.
		for(int i = 0; i < N; i++) {
			g[i] = new ArrayList<>();
		}
		
		v = new boolean[N];
		
		for(int i = 0; i < E; i++) {// 간선정보에 해당하는 부분만 덮어씀
			int from = sc.nextInt();
			int to = sc.nextInt();
			g[from].add(to); //무향
			g[to].add(from);;	
		}
		
		//bfs(0);
		dfs(0);
		sc.close();
	}

	private static void dfs(int i) {
		v[i] = true;
		System.out.print((char)(i+ 'A')+ " ");
		
		// 현 정점의 인접정점들 큐에 넣어서 차후 탐색하도록 만들기
		for (int j : g[i]) {
			if(!v[j]) {
				dfs(j);
			}
		}
		
		
	}
	
	static void bfs(int i) {
		Queue<Integer> q = new ArrayDeque<>();
		v[i] = true;
		q.offer(i);
		
		while(!q.isEmpty()) {
			
			i = q.poll();
			System.out.print((char)(i+ 'A') + " ");
			
			for (int j : g[i]) {
				if(!v[j]) {
					v[j] = true;
					q.offer(j);
				}
			}
			
		}
		
	}

}