

import java.io.*;
import java.util.*;

public class PPCH {

	static int N = 4, R = 3, C= 0;
	static int[] a = {1,2,3,4};
	static boolean[] v = new boolean[N];
	static int[] b = new int[R];
	
	static void ppch(int depth, int start) {
		if(depth == R) {
			System.out.println(Arrays.toString(b));
			C++;
			return;
		}
		
		for(int i = start; i < N; i++) {
//			if(!v[i]) {
//				v[i] = true;
				b[depth] = a[i];
				//ppch(depth+1,0);
				//ppch(depth+1,i);
				ppch(depth+1,i);
//				v[i] = false;
//			}
		}
	}
	public static void main(String[] args) throws IOException{
		C = 0;
		//ppch(0,0); //순열 4P3 =24
		//ppch(0,0); // 중복순열 4ㅠ3=64
		ppch(0,0); // 중복조합 4H3 = 4+3 - 1C3 = 6C3 = 20
		System.out.println(C);
	}

}
