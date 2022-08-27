package boj;

import java.io.*;
import java.util.*;

public class p1759 {
	
	static int l,c;
	static char[] arr;
	static int[] visited;
	static List<String> ss = new ArrayList<String>();
	
	
	
	static void bt(int cnt,int start,String s) {
		
		if(cnt == l) {
			
			int consonant = 0;
			int vowel = 0;
			
			for(int i = 0; i <s.length();i++) {
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' 
						|| s.charAt(i) == 'i' || s.charAt(i) == 'o' 
						|| s.charAt(i) == 'u') {
					vowel++;
				}else {
					consonant++;
				}
			}
			if(vowel >= 1 && consonant >= 2) {
				ss.add(s);
			}
			
			return;
		}
		
		
		for(int i = start; i < arr.length;i++) {
			
			bt(cnt+1,i+1,s + arr[i]);
		}
		
	}
	

	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		arr = new char[c];
		visited = new int[c];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < c; i++) {
			arr[i] = st.nextToken().charAt(0);
		}
		Arrays.sort(arr);
		
		bt(0,0,"");
		
		for(String a : ss) {
			System.out.println(a);
		}

	}

}