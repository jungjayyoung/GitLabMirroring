package day1;

public class CoinTest {

	public static void main(String[] args) {
		int money = 4580;
		int[] coins= {1000,500,100,50,10};

		for(int i=0;i<coins.length;i++) {
			
			if(money/coins[i] != 0) {
				System.out.println(coins[i] + "원 "+ money/coins[i] + "개");
				// 포맷팅
				System.out.printf("%4d원 %d개%n", coins[i],money/coins[i]);
			}
			money %= coins[i];
			
		}
	}

}
/*
 * 1000원 4개
 * 500원 1개
 * 50원 1개
 * 10원 3개
 */
