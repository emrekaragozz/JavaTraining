package hw9;

public class Q43 {
    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3); //is not available on ArrayList
        mystery = mystery.insert(1, "more"); // is not available on String and ArrayList
        int num = mystery.length(); // is not available on ArrayList
    }
}
