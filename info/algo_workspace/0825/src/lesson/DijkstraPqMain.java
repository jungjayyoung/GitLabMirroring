package lesson;
import java.io.*;
import java.util.*;

public class DijkstraPqMain {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] g = new int[N][N];
		boolean[] v = new boolean[N];
		int[] dist = new int[N];
		
		for(int i=0; i<N; i++) {
		
			for(int j = 0; j < N; j++) {
				g[i][j] =sc.nextInt();
			}
			dist[i] = Integer.MAX_VALUE;
		}
		
		PriorityQueue<int[]> pq =new PriorityQueue<>((o1,o2)->Integer.compare(o1[1], o2[1]));
		dist[0]=0;
		pq.offer(new int[] {0,0}); // 정점, 가중치
		
		while(!pq.isEmpty()) {
			int [] cur = pq.poll();
			int min = cur[1];
			int minVertax = cur[0];
			
			if(v[minVertax]) continue;
			
			v[minVertax] = true;
			if(minVertax == N-1) break;
			
			for(int j = 0; j < N; j++) {
				if(!v[j] && g[minVertax][j] != 0 && dist[j] > min + g[minVertax][j]) {
													dist[j] = min + g[minVertax][j];
													pq.offer(new int[] {j,dist[j]});
				}
			}
		}
		
		System.out.println(dist[N-1]);
		sc.close();

	}

}
