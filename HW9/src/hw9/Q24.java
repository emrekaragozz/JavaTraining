package hw9;

import java.util.*;

public class Q24 {
	public static void secret(String mystery) {
		mystery = mystery.replace("1","8");
		mystery.startsWith("paper");
		String s = mystery.toString();
	}
	
	/*
	public static void secret(StringBuilder mystery) {
		mystery = mystery.replace("1","8"); //incorrect arguments
		mystery.startsWith("paper"); // undefined method
		String s = mystery.toString();
	}
	
	public static void secret(ArrayList mystery) {
		mystery = mystery.replace("1","8"); //undefined method
		mystery.startsWith("paper"); //undefined method
		String s = mystery.toString();
	}
	*/
}

