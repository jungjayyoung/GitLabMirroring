import java.io.*;
import java.util.*;


public class TopologySortTest {
	
	static class Node{
		int vertex, weight;
		Node next;
		public Node(int vertex, Node next) {
			this.vertex = vertex;
			this.next = next;
		}
	
	}
	
	static int V,E;
	static Node[] adjList;
	static int[] inDegree;

	public static void main(String[] args) throws IOException{

		
		// 정점 수, 간선 수  입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
				
		adjList = new Node[V + 1]; // 각 정점별 인접리스트
		inDegree = new int[V + 1]; // 각 정점별 진입차수
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			
			// 유향 처리
			adjList[from] = new Node(to,adjList[from]);
			inDegree[to]++;
		}
		
		ArrayList<Integer> list = topologySort();
		
		if(list.size() == V) { // 위상정렬 완성
			for (Integer i : list) {
				System.out.print(i+ " ");
			}
		}else { //싸이클 발생
			System.out.println("cycle..");
		}
		
		
	}
	
	private static ArrayList<Integer> topologySort(){
		
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Integer> q = new ArrayDeque<>();
		// 진입차수가 0 인 정점 큐에 넣기
		for(int i = 1; i <=V; i++) {
			if(inDegree[i] == 0) q.offer(i);
		}
		
		// BFS
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			list.add(cur);
			
			for(Node temp = adjList[cur]; temp != null; temp = temp.next) {
				if(--inDegree[temp.vertex] == 0) {
					q.offer(temp.vertex);
				}
			}
			
			
			
		}
		return list;
		
	}

}
