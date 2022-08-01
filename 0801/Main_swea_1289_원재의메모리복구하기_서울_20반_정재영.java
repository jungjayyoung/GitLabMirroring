import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1289 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(bf.readLine());
		
		
		int tc = Integer.parseInt(bf.readLine());
		
		
		for(int t = 1; t <= tc; t++) {
			String s = bf.readLine();
			int n = (int)s.length();
			char [] tmp = new char[n];
			
			for(int i = 0; i<s.length();i++) {
				tmp[i] = '0';
			}
			int cnt = 0;
			for(int i = 0; i< s.length();i++) {
				
				if(s.charAt(i) != (char)tmp[i]) {
					cnt++;
					if(tmp[i] == '0') {
						for(int j = i; j < s.length();j++) {
							tmp[j] = '1';
						}
					}else {
						for(int j = i; j < s.length();j++) {
							tmp[j] = '0';
						}
					}
				}
				
			
			}
			
			System.out.println("#" + t + " " + cnt);
			
		}
		
		

	}

}
