package boj;

import java.io.*;
import java.util.*;

public class p1541 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s = br.readLine();
		st =new StringTokenizer(s,"+|-");
		List<Integer> arr = new ArrayList<Integer>();

		while(st.hasMoreElements()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		
		int sum = arr.get(0);
		int cnt = 0;
		// 마이너스가 나오기 전까지는 다 더하고 -가 나오면 그 뒤는 다 빼면 된다.
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i) == '-') {
				break;
			}else if(s.charAt(i) == '+') {
				cnt++;
			}
		}
		
		
		for(int i = 1; i< arr.size();i++) {
			
			if(i <= cnt) {
				sum += arr.get(i);
			}else {
				sum-= arr.get(i);
			}
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
