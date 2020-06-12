package hw9;

public class Q39 {

	public static void main(String[] args) {
		String happy = " :) - (: ";
		String really = happy.trim(); // ":) - (:"
		
		//starting with index "1" of "happy" until, but not including, the last character
		String question = happy.substring(1, happy.length() - 1) ; // "":) - (:""
		
		System.out.println(question);
		System.out.println(really);		
		
		System.out.println(really.equals(question));
	}

}
