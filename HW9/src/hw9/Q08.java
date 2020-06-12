package hw9;

import java.util.*;

public class Q08 {
	public static void main(String[] args) {
		List<String> museums = new ArrayList<>(1); // created with one slot but it can be expanded
		museums.add("Natural History");
		museums.add("Science");
		museums.add("Art");
		museums.remove(2); // "Art" is removed
		System.out.println(museums); // prints [Natural History, Science]
	}

}
