package day4;

class Book{
	
	int code;
	String title;
	double price;
	
	public Book(int code, String title, double price) {
		super();
		this.code = code;
		this.title = title;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (code != other.code)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	
	
	
	
	
}
public class EqualsBook {

	public static void main(String[] args) {
		Book b1 =new Book(101,"자바",25000);
		Book b2 =new Book(101,"자바",25000);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		// 오버라이딩 시키지 않으면 아래의 Object equals 가 실행된다.
//		public boolean equals(Object obj) {
//	        return (this == obj);
//	    }
		
	}

}
