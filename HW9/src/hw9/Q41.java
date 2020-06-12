package hw9;

public class Q41 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("54321");

		// substring() returns a String rather than a StringBuilder
		// builder is not changed
		builder.substring(2); // "321"

		System.out.println(builder.charAt(1)); // "1" is at index 4
	}

}
