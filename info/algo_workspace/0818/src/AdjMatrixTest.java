
import java.util.*;
import java.io.*;


public class AdjMatrixTest {

	static int[][] adjMatrix;
	static int N;
	static boolean v[];
	
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int E = sc.nextInt();
		
		adjMatrix = new int[N][N]; // 0으로 자동 초기화
		v = new boolean[N];
		
		for(int i = 0; i < E; i++) {// 간선정보에 해당하는 부분만 덮어씀
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjMatrix[to][from] = adjMatrix[from][to] = 1;
		}
		
		bfs();
		//dfs(0);
	}
	
	static void dfs(int cur) {
		
		v[cur] = true;
		System.out.print((char)(cur+ 'A'));
		
		// 현 정점의 인접정점들 큐에 넣어서 차후 탐색하도록 만들기
		for (int i = 0; i < N; i++) {
			if(!v[i] && adjMatrix[cur][i] != 0) {
				
				dfs(i);
			}
		}
	}
	
	static void bfs() {
		
		//0 정점 시작점
		Queue<Integer> q = new ArrayDeque<>();
		boolean[] visited = new boolean[N]; // 방문 관리 배열
		
		visited[0] = true;
		q.offer(0);
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print((char)(cur+ 'A') + " ");
			
			// 현 정점의 인접정점들 큐에 넣어서 차후 탐색하도록 만들기
			for (int i = 0; i < N; i++) {
				if(!visited[i] && adjMatrix[cur][i] != 0) {
					visited[i] = true;
					q.offer(i);
				}
			}
			
			
		}
		
		System.out.println();
	}
	
	
	
	

}
