
public class Student {

	String name;
	int java,algo;
	public Student(String name, int java, int algo) {
		this(name,java);
		this.algo = algo;
	}
	
	public Student(String name, int java) {
		super();
		this.name = name;
		this.java = java;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=").append(name).append(", java=").append(java).append(", algo=").append(algo)
				.append("]");
		return builder.toString();
	}

	

	
	
	
}
