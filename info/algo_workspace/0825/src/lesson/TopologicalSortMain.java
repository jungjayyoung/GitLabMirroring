package lesson;

import java.io.*;
import java.util.*;

public class TopologicalSortMain {
	static int N,M;
	static List<Integer>[] g;
	static int[] inDegree;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		g = new List[N + 1]; for(int i = 0; i <N + 1; i++) g[i] = new ArrayList<>();
		
		
		inDegree = new int[N + 1]; // 진입차수
		
		for(int i=0; i<M; i++) {
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			g[a].add(b);
			inDegree[b]++;
		}
		
		
		topologicalSort();
		
	
		sc.close();

	}
	
	static void topologicalSort() {
		Queue<Integer> q = new ArrayDeque<>();
		
		for(int i = 1; i <=N; i++) {
			if(inDegree[i] == 0) q.offer(i);
		}
		
		
		while(!q.isEmpty()) {
			
			int cur = q.poll();
			
			System.out.print(cur + " ");
			
			for(int j : g[cur]) {
				
				
				if(--inDegree[j] == 0) {
					q.offer(j);
				}
			}
			
			
			
			
		}
		
		
	}

}
