import java.util.*;
import java.io.*;

public class p1954 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int tc = Integer.parseInt(bf.readLine());
         
        for(int t = 1; t <=tc; t++) {
             
            int n = Integer.parseInt(bf.readLine());
            int [][] arr = new int [n][n];
       
           
            int cnt = 1;
             
            int start_x = 0;
            int start_y = 0;
             
             
            while(cnt <= n * n) {
                 
                //오른쪽
                while(start_x < n && arr[start_y][start_x] == 0) {
                    if(arr[start_y][start_x] == 0) {
                        arr[start_y][start_x] = cnt++;
                        start_x++;
                    }
                }
                start_x = start_x - 1;
                start_y = start_y + 1;
 
                 
                //아래쪽
                while(start_y < n && arr[start_y][start_x] == 0) {
                    if(arr[start_y][start_x] == 0) {
                        arr[start_y][start_x] = cnt++;
                        start_y++;
                    }
                }
                start_y = start_y - 1;
                start_x = start_x - 1;
                 
 
                //왼쪽
                while(start_x >= 0 && arr[start_y][start_x] == 0) {
                    if(arr[start_y][start_x] == 0) {
                        arr[start_y][start_x] = cnt++;
                        start_x--;
                    }
                }
                start_x = start_x + 1;
                start_y = start_y - 1;
 
                //위쪽
                while(start_y >= 0 && arr[start_y][start_x] == 0) {
                    if(arr[start_y][start_x] == 0) {
                        arr[start_y][start_x] = cnt++;
                        start_y--;
                    }
                }
                start_y = start_y + 1;
                start_x = start_x + 1;
                 
                 
            }
             
            System.out.println("#"+ t);
            for(int y =0; y < n; y++) {
                 
                for(int x = 0; x < n; x++) {
                    System.out.print(arr[y][x] +" ");
                }
                System.out.println();
            }
             
             
        }
	}

}
