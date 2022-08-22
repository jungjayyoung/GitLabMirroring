import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R1_FactorialTest {

	
	static int res = 1;
	
	static void factorial2(int i) {
		if(i < 1) return;
		res *= i;
		factorial2(i-1);
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		factorial2(n);
		System.out.println(res);

	}
	
	

}
