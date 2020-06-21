package hw10;

public class Q68 {
    public static void seasons(String... names) {
        //System.out.println(names[1]); "Fall"
        int l = names[1].length(); // s1  l = "4"
        //System.out.println(l);
        System.out.println(names[l]); // s2 - ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        seasons("Summer", "Fall", "Winter", "Spring");
    }
}
