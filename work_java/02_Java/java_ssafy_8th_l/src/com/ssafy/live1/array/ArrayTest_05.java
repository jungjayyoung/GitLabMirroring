package com.ssafy.live1.array;

public class ArrayTest_05 {
    public static void main(String[] args) {
        String org = "1234567890";

        // TODO: String "1234567890" 의 자리 별 수를 1차원 배열에 저장하고 배열을 순회해서 그 합을 출력하시오.
        char [] nums = org.toCharArray();
        
        int [] arr = new int[10];
       
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
        	
        	arr[i] = org.charAt(i) - '0';
        	sum += arr[i];
        }
        int sum2 = 0;
        for(int i = 0; i<nums.length;i++) {
        	sum2 += nums[i] - '0';
        }
        
        
        // END:
        System.out.println(sum);
        System.out.println(sum2);
    }
}
