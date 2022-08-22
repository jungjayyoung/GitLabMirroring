
import java.util.*;
import java.io.*;


public class GraphMatrix {

	static int[][] g;
	static int N;
	static boolean []v;
	
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int E = sc.nextInt();
		
		g = new int[N][N]; // 0으로 자동 초기화
		v = new boolean[N];
		
		for(int i = 0; i < E; i++) {// 간선정보에 해당하는 부분만 덮어씀
			int from = sc.nextInt();
			int to = sc.nextInt();
			g[to][from] = g[from][to] = 1; // 무향
		}
		
		//bfs();
		dfs(0);
		
		sc.close();
	}
	
	static void dfs(int i) {
		
		v[i] = true;
		System.out.print((char)(i+ 'A')+ " ");
		
		// 현 정점의 인접정점들 큐에 넣어서 차후 탐색하도록 만들기
		for (int j = 0; j < N; j++) {
			if(!v[j] && g[i][j] != 0) {
				dfs(j);
			}
		}
	}
	
	static void bfs() {
		
		//0 정점 시작점
		Queue<Integer> q = new ArrayDeque<>();
		boolean[] v = new boolean[N]; // 방문 관리 배열
		
		v[0] = true;
		q.offer(0);
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print((char)(cur+ 'A'));
			
			// 현 정점의 인접정점들 큐에 넣어서 차후 탐색하도록 만들기
			for (int i = 0; i < N; i++) {
				if(!v[i] && g[cur][i] != 0) {
					v[i] = true;
					q.offer(i);
				}
			}
			
			
		}
		
		System.out.println();
	}
	
	
	
	

}
