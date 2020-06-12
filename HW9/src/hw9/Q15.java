package hw9;

public class Q15 {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("12");
        b.append("3");
        b.reverse(); // this method is not available on String's
        System.out.println(b.toString()); //prints "321"
    }
}
