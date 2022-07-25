import java.util.Arrays;

public class Student3Test {

	public static void main(String[] args) {

		Student students9[] = new Student[2]; // 배열 객체만 생성
//		System.out.println(Arrays.toString(students));
//		
//		
		students9[0] = new Student("김싸피", 100,96);
		students9[1] = new Student("이싸피", 100,90);
		// 데이터타입 변수명
		
		Student[] seoulClasses[] = new Student[2][];
		
		seoulClasses[0] = students9;
		seoulClasses[1] = new Student[] {
				new Student("박윤환",100,100),
				new Student("홍길동",95,85),
				new Student("김철수",90,80)
		};
		
//		
//		
		print(seoulClasses);

		
	}
	
	private static void print(Student[][] seoulClasses) {
		for (Student[] students : seoulClasses) {
			print(students);
			System.out.println("========");
		}
	}

	private static void print(Student[] students) {
		for (Student student : students) {
			print(student);
		}
	}

	public static void print(Student student) {
		
		System.out.println(student.name + ":" + student.java+","+ student.algo);
		//System.out.println(student.toString());
		
	}

}
