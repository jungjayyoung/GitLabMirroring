
public class StudentTest {

	public static void main(String[] args) {

		// 데이터타입 변수명
		Student scores = new Student("김싸피", 100,96);
		Student scores2 = new Student("이싸피", 100,90);
		
		
		print(scores);
		print(scores2);
		
	}
	
	public static void print(Student student) {
		
		
		System.out.println(student.name + ":" + student.java+","+ student.algo);
	}

}
