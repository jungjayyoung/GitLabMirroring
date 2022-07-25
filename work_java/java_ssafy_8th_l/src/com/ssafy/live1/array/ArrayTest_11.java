package com.ssafy.live1.array;


public class ArrayTest_11 {
	public static void main(String[] args) {
		int[] intArray = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };

		// TODO: 위 배열의 요소 중 평균(실수, 소숫점 세째에서 반올림 출력)과 절대값 기준으로
		//  평균에서 가장 거리가 먼 값을 출력하시오.(여러 개일 경우는 하나만)
		
		double avg = 0.0;
		
		for(int i = 0; i< intArray.length;i++) {
			avg += intArray[i];
		}
		
		avg /= 1.0 * intArray.length;
		
		double minn =1000;
		double maxx = -1;
		int maxIdx = -1;
		int minIdx = -1;
		for(int i = 0; i <intArray.length;i++) {
			if(Math.abs(intArray[i] - avg) > maxx) {
				maxx = Math.abs(intArray[i] - avg);
				maxIdx = i;
				
			}
			
			if(Math.abs(intArray[i] - avg) < minn) {
				minn = Math.abs(intArray[i] - avg);
				minIdx = i;
			}
		}
		// END:
		System.out.printf("avg:%.2f, maxDiff: %d, minDiff:%d%n", avg, intArray[maxIdx], intArray[minIdx]);

	}
}