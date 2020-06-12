package hw9;

public class Q33 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("red"); //"red"
		sb.deleteCharAt(0); // "ed"
		sb.delete(1, 2); // "e"
		System.out.println(sb); // "e" is printed
	}

}
