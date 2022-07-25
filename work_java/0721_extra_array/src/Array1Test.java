
public class Array1Test {

	//배열(동형 집합) 사용 목적
	// 1. 여러 데이터를 하나의 집합으로 관리 ==> 하나의 단위로 전달하거나 리턴이 가능
	// 2. 인덱스(offset)가 0부터 1씩 증가하는 성질을 이용하여 반복문을 결합한 일괄처리
	
	public static void main(String[] args) {

		// 데이터타입 변수명
		int[] scores = new int[3]; // 3개의 과목 점수
		scores[0] = 100;
		scores[1] = 96;
		scores[2] = 92;
		
		
		print(scores);
		
		int[] scores2 = {100,90,85,80};
		print(scores2);
		
	}
	
	public static void print(int[] arr) {
		for(int i : arr) { //배열, Iterable 타입의 모든 원소를 순회(read)
			System.out.println(i);
		}
	}

}
