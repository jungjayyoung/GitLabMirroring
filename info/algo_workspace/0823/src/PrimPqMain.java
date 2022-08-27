import java.io.*;
import java.util.*;

public class PrimPqMain {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] g = new int[N][N];
		boolean[] v = new boolean[N];
		int[] minEdge = new int[N];
		
		for(int i=0; i<N; i++) {
		
			for(int j = 0; j < N; j++) {
				g[i][j] =sc.nextInt();
			}
			minEdge[i] = Integer.MAX_VALUE;
		}
		
		int result = 0, cnt = 0;
		PriorityQueue<int[]> pq =new PriorityQueue<>((o1,o2)->Integer.compare(o1[1], o2[1]));
		minEdge[0]=0;
		pq.offer(new int[] {0,0});
		
		while(!pq.isEmpty()) {
			int [] cur = pq.poll();
			int min = cur[1];
			int minVertax = cur[0];
			
			if(v[minVertax]) continue;
			
			v[minVertax] = true;
			result += min;
			if(cnt++ == N-1) break;
			
			for(int j = 0; j < N; j++) {
				if(!v[j] && g[minVertax][j] != 0 && minEdge[j] > g[minVertax][j]) {
					minEdge[j] = g[minVertax][j];
					pq.offer(new int[] {j,g[minVertax][j]});
				}
			}
			
		}
		
		
		System.out.println(result);
		sc.close();

	}

}