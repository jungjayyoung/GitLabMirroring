import java.io.*;
import java.util.*;


public class p1208 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int t = 1; t <=10; t++) {
		
			int n = Integer.parseInt(bf.readLine());
		
			int [] box = new int[100];
			
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			int minn = 1000;
			int maxx = -1;
			int minn_idx = -1;
			int maxx_idx = -1;
			for(int i=0; i<100;i++) {
				box[i] = Integer.parseInt(st.nextToken());
				
				if(minn > box[i]) {
					minn = box[i];
					minn_idx = i;
				}
				
				if(maxx < box[i]) {
					maxx = box[i];
					maxx_idx = i;
				}
				
				
			}
	
			int cnt = 0;
			
			while(cnt <= n && maxx_idx != minn_idx && box[maxx_idx] > box[minn_idx]) {
				
				
				
				maxx = -1;
				minn = 1000;
				for(int j=0; j<100;j++) {
					if(minn > box[j]) {
						minn_idx = j;
						minn = box[j];
					}
					
					if(maxx < box[j]) {
						maxx_idx = j;
						maxx = box[j];
					}
					
					
				}
				
				
				box[maxx_idx] = box[maxx_idx] - 1;
				box[minn_idx] = box[minn_idx] + 1;
			
				cnt++;
				
			}
			
		
		
		
			System.out.println("#" + t + " " + (maxx - minn));
		
			
			
		}
		
		
		
		
		
		
		
		
	}

}
