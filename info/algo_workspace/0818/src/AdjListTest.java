

import java.util.*;
import java.io.*;


public class AdjListTest {
	
	static class Node{
		int to;
		Node next;
		
		public Node(int to, Node next) {
			this.to = to;
			this.next = next;
		}
		
		
	}
	
	static Node[] adjlist;
	static int N;
	static boolean visited[];

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int E = sc.nextInt();
		
		adjlist = new Node[N];
		visited = new boolean[N];
		
		for(int i = 0; i < E; i++) {// 간선정보에 해당하는 부분만 덮어씀
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjlist[from] = new Node(to, adjlist[from]);
			adjlist[to] = new Node(from, adjlist[to]);
		}
		
		
		dfs(0);
		
		
	}

	private static void dfs(int cur) {
		
		visited[cur] = true;
		System.out.print((char)(cur+ 'A'));
		
		// 현 정점의 인접정점들 큐에 넣어서 차후 탐색하도록 만들기
		for (Node temp = adjlist[cur]; temp != null; temp = temp.next) {
			if(!visited[temp.to]) {
				dfs(temp.to);
			}
		}
		
		
	}

}