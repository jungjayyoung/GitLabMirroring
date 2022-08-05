package swea_ps;
import java.io.*;
import java.util.*;


public class Solution_d3_1225_암호생성기_서울_20반_정재영 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		for(int t = 1; t<=10;t++) {
			ArrayDeque<Integer> q = new ArrayDeque<>();
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<8;i++) {
				q.offer(Integer.parseInt(st.nextToken()));
			}
			
			int cnt = 0;
			while(true) {
				cnt++;
				if(cnt > 5) {
					cnt = 1;
				}
				int front = q.poll();
				if(front - cnt <= 0)
					front = 0;
				else
					front = front - cnt;
				q.offer(front);
				
				if(front == 0) {
					break;
				}
				
				
			}
			System.out.print("#" + t + " ");
			while(!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
