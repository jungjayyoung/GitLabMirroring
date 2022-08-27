import java.io.*;
import java.util.*;

public class KruskalMain {
	static int N;
	static int[][] edges;
	static int[] p;

	static void makeSet() {
		p = new int[N];
		for(int i = 0; i<N;i++) {
			p[i] = i;
		}
	}
	
	static int findSet(int a) {
		if(a == p[a]) return a;
		return p[a] = findSet(p[a]); 
	}
	
	static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		if(aRoot == bRoot) return false;
		
		p[bRoot] = aRoot;
		
		return true;
	}
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		

		int E = sc.nextInt();
		edges = new int[E][3];
		for(int e=0; e<E;e++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int weight = sc.nextInt();
			edges[e] = new int[] {from,to,weight};
		}
		Arrays.sort(edges,(o1, o2) -> Integer.compare(o1[2], o2[2]));
		makeSet();
		int result = 0, cnt = 0;
		for(int[] edge:edges) {
			if(union(edge[0],edge[1])) {
				result += edge[2];
				if(++cnt == N - 1) break;
			}
		}
		//
		System.out.println(result);
		sc.close();

	}

}