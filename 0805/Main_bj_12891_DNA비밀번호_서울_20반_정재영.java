package bj;
import java.io.*;
import java.util.*;

public class Main_bj_12891_DNA비밀번호_서울_20반_정재영 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		String dna = br.readLine();
		
	
		st = new StringTokenizer(br.readLine());
		int a_min = Integer.parseInt(st.nextToken());
		int c_min = Integer.parseInt(st.nextToken());
		int g_min = Integer.parseInt(st.nextToken());
		int t_min = Integer.parseInt(st.nextToken());
		
		int a_cnt =0, c_cnt = 0, g_cnt =0, t_cnt =0;
		
		ArrayDeque<Character> q = new ArrayDeque<>();
		
		for(int i = 0; i <p; i++) {
			q.offer(dna.charAt(i));
			if(dna.charAt(i) == 'A') {
				a_cnt++;
			}else if(dna.charAt(i) == 'C') {
				c_cnt++;
			}else if(dna.charAt(i) == 'G') {
				g_cnt++;
			}else if(dna.charAt(i) == 'T') {
				t_cnt++;
			}
		}
		int ans = 0;
		if(a_cnt >= a_min && c_cnt >= c_min 
				&& g_cnt >= g_min && t_cnt >= t_min) {
			ans++;
		}
		
		for(int i = p; i< dna.length();i++) {
			int cur = q.poll();
			if(cur == 'A') {
				a_cnt--;
			}else if(cur == 'C') {
				c_cnt--;
			}else if(cur == 'G') {
				g_cnt--;
			}else if(cur == 'T') {
				t_cnt--;
			}
			q.offer(dna.charAt(i));
			if(dna.charAt(i) == 'A') {
				a_cnt++;
			}else if(dna.charAt(i) == 'C') {
				c_cnt++;
			}else if(dna.charAt(i) == 'G') {
				g_cnt++;
			}else if(dna.charAt(i) == 'T') {
				t_cnt++;
			}
			
			if(a_cnt >= a_min && c_cnt >= c_min 
					&& g_cnt >= g_min && t_cnt >= t_min) {
				ans++;
			}
			
		}
		
		System.out.println(ans);
		
	}

}
