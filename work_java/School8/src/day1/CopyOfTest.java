package day1;

import java.util.Arrays;

public class CopyOfTest {

	public static void main(String[] args) {
		int[] scores = {90,80,100};
		//scores[3] =95; //ArrayIndexOutOfBoundsException

		scores = new int[]{90,80,100,95};
		
		
		scores=Arrays.copyOf(scores, 5);
		scores[3] = 85;
		
		int[] score2= new int[5];
		System.arraycopy(scores, 0, score2, 0, 4);
		System.out.println(Arrays.toString(score2));
	}

}
