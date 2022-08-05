package swea_ps;
import java.io.*;
import java.util.*;

public class Solution_d4_1218_괄호짝짓기_서울_20반_정재영 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		
		for(int i=1;i<= 10; i++) {
			ArrayDeque<Character> st = new ArrayDeque<>();
			int size = Integer.parseInt(br.readLine());
			String s = br.readLine();
			
			boolean check = false;
			
			for(int j=0; j<size;j++) {
				if(s.charAt(j) == '[' || s.charAt(j) == '(' || s.charAt(j) == '{' ) {
					st.push(s.charAt(j));
				}else {
					
					if(st.isEmpty()) {
						check = true;
						break;
					}
					if(s.charAt(j) == ']') {
						if(!st.isEmpty() && st.pop() != '[') {
							check = true;
							break;
						}
					}else if(s.charAt(j) == '}') {
						if(!st.isEmpty() && st.pop() != '{') {
							check = true;
							break;
						}
					}else if(s.charAt(j) == ')') {
						if(!st.isEmpty() && st.pop() != '(') {
							check = true;
							break;
						}
					
					}
					
				}
			}
			
			if(check) {
				System.out.println("#" + i + " " + '0');
			}else {
				System.out.println("#" + i + " " + '1');
			}
			
			
		}

	}

}
