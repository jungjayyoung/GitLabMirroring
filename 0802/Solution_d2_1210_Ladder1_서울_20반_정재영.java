import java.io.*;
import java.util.*;

public class p1210 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		for(int t = 1; t <= 10; t++) {
			int [][] ladder = new int [101][101];
			int tc = Integer.parseInt(bf.readLine());
			
			//처음 시작값
			int yy = -1;
			int xx = -1; 
			
			
			for(int y = 0 ; y< 100;y++) {
				st = new StringTokenizer(bf.readLine());
			
				for(int x = 0; x < 100; x++) {
					
					ladder[y][x] = Integer.parseInt(st.nextToken());
					if(ladder[y][x] == 2) {
						xx = x;
						yy = y;
					}
					
				}
			}
			
			
			
			// xx,yy 처음 시작값
			while(yy > 0) {
				
				
	
				
				
				if(xx  < 99 && ladder[yy][xx + 1] == 1) {
					while(xx < 99 && ladder[yy][xx + 1] == 1) {
						xx++;
					}
				}else if(xx > 0 && ladder[yy][xx - 1] == 1) {
					
					while(xx > 0 && ladder[yy][xx - 1] == 1) {
						xx--;
					}
					
				}
				
				if(ladder[yy - 1][xx] == 1) {
					yy--;
				}
				
				
			}
			
			
			System.out.println("#" + tc + " " + xx);
			
		}
		
		bf.close();
		
		
	}

}
