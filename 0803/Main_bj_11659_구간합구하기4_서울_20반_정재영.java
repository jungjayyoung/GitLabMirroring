import java.io.*;
import java.util.*;


public class Main {


	
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<Integer> dp = new ArrayList<>();
	
		// 기저 조건
		st = new StringTokenizer(br.readLine());
		dp.add(0);
		dp.add(Integer.parseInt(st.nextToken()));
		for(int i=2; i<=n; i++) {
			dp.add(Integer.parseInt(st.nextToken()) + dp.get(i-1));
		}

	
		for(int i = 0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(dp.get(b) - dp.get(a- 1));
			
		}
		
		
	}

}
