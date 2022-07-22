import java.util.Arrays;

public class Student2Test {

	public static void main(String[] args) {

		// 데이터타입 변수명
		Student students[] = new Student[2]; // 배열 객체만 생성
//		System.out.println(Arrays.toString(students));
//		
//		
		students[0] = new Student("김싸피", 100,96);
		students[1] = new Student("이싸피", 100,90);
//		
//		
		print(students);

		
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
