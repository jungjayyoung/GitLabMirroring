package boj;

import java.util.*;
import java.io.*;

public class p1158 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		int n,k;
		
		ArrayDeque<Integer> d = new ArrayDeque<>();
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i<=n;i++) {
			d.add(i);
		}
		
		System.out.print("<");
		int cnt = 0;
		while(d.size() != 1) {
			
			int tmp = d.peekFirst();
			d.poll();
			cnt++;
			if(cnt == k) {
				System.out.print(tmp + ", ");
				cnt = 0;
			}else {
				d.add(tmp);
			}
			
		}
		System.out.println(d.peekFirst() + ">");
		
		

	}

}