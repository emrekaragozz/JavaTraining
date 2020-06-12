package hw9;

public class Q30 {
	public static void main(String[] args) {
		String builder = "54321";
		builder = builder.substring(4); //returns "1"
		// System.out.println(builder);
		
		System.out.println(builder.charAt(2)); // throws StringIndexOutOfBoundsException
	}
}
