package hw9;

public class Q22 {

	public static void main(String[] args) {
		String s = "abc123";
		
		System.out.println(s);
		
		System.out.println(s.contains("abc")); //true
		System.out.println(s.equals("abc")); //false
		System.out.println(s.startsWith("abc")); //true
		System.out.println(s.contains("abc")); //true

		String s2 = "123abc";
		
		System.out.println(s2);
		
		
		System.out.println(s2.contains("abc")); //true
		System.out.println(s2.equals("abc")); //false
		System.out.println(s2.startsWith("abc")); //false
		System.out.println(s2.contains("abc")); //true
		
	}
	
	// If a String s starts with "abc", s.contains() is always true; 
	
	/*
	 * When String s="abc123", s.contains("abc") is true but s.equals("abc") is false
	   When String s1="123abc"; s1.contains("abc") is true but s2.startsWith("abc") is false
	   When String s="abc123", s.contains("abc") is true but s.equals("abc") is false
	 	*/

}
