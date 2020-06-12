package hw9;

import java.util.function.Predicate;

public class Q34 {

	public static void main(String[] args) {
		Predicate<String> clear = c -> c.equals("clear");
		System.out.println(clear.test("pink")); //prints false

		/*
		 * Predicate<String> predicate = new Predicate<String>() { public boolean
		 * test(String c) { return c.equals("clear"); } }
		 * System.out.println(predicate.test("pink")); ;
		 */

	}

}
