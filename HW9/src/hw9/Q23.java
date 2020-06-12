package hw9;

import java.util.*;

public class Q23 {

	public static void main(String[] args) {
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(1, 'c');
		chars.remove(0);

		// length method cannot be used with ArrayLists
		// in order to get number of elements of an “ArrayList”, “size()” method should be used
		System.out.print(chars.size()); // length method cannot be used with ArrayLists
	}

}
