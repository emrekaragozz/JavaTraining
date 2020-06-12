package hw9;

import java.util.function.*;

public class Q28 {

	public static void main(String[] args) {
		Predicate<String> dash = c -> c.startsWith("-"); //<String> is inserted
		System.out.println(dash.test("–"));
	}

}
