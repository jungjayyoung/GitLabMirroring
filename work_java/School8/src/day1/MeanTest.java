package day1;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MeanTest {

	public static void main(String[] args) {
		int[] a = {57,72,89,46,67,35,58,25,17,10};
		
		
		//평균 쉽게 구하는 방법
		//System.out.println(Arrays.stream(a).average().orElse(0.0));
		
		double avg = 0.0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		
		avg = (double)sum / a.length;
		
		double minn = Integer.MAX_VALUE;
		int min_idx = -1;
		for(int i=0;i<a.length;i++) {
			
			if(Math.abs(avg - a[i]) < minn) {
				minn = Math.abs((double)avg - a[i]);
				min_idx = i;
			}
		}
		System.out.println(avg);
		System.out.println(a[min_idx]);

	}

}
/*
평균: 0.xx
평균과 가장 가까운 수: xx
평균과 가장 
*/