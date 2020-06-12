package hw9;

public class Q09 {

	public static void main(String[] args) {
		StringBuilder b = new StringBuilder("12");
		b = b.append("3");
		b.reverse(); // "123" to "321"
		System.out.println(b.toString()); // prints 321
	}

}
