package hw2;

public class Q30 {
    static String cat = "animal", dog = "animal"; // valid declaration
    // String cat = "animal"; dog = "animal"; invalid, type is missing for dog
    // String cat, dog = "animal"; valid but no value is assigned to cat
    // String cat, String dog = "animal"; invalid because type should be used one in a declaration
    public static void main(String[] args) {
        System.out.println(cat + " and " + dog);
    }
}
