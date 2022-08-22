

import java.util.*;
import java.io.*;


public class GraphListNode {
	
	static class Node{
		int to;
		Node next;
		public Node(int to, Node next) {
			this.to = to;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return (char)(to+'A') + "("+to + ")" + next;
		}
		
	}
	
	static Node[] g;
	static int N;
	static boolean[] v;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int E = sc.nextInt();
		g = new Node[N];
		v = new boolean[N];
		
		for(int i = 0; i < E; i++) {// 간선정보에 해당하는 부분만 덮어씀
			int from = sc.nextInt();
			int to = sc.nextInt();
			g[from] = new Node(to, g[from]); //무향
			g[to] = new Node(from, g[to]);	
		}
		
		bfs(0);
		//dfs(0);
		sc.close();
	}

	private static void dfs(int i) {
		v[i] = true;
		System.out.print((char)(i+ 'A'));
		
		// 현 정점의 인접정점들 큐에 넣어서 차후 탐색하도록 만들기
		for (Node j = g[i]; j != null; j = j.next) {
			if(!v[j.to]) {
				dfs(j.to);
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
			
			for (Node j = g[i]; j != null; j = j.next) {
				if(!v[j.to]) {
					v[j.to] = true;
					q.offer(j.to);
				}
			}
			
		}
		
	}

}
