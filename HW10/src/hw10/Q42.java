package hw10;

public class Q42 {

    /*In Java, a variable name may start with and underscore and we can add
    underscores anywhere except at the beginning of a literal, the end of a
    literal, right before a decimal point, or right after a decimal point. */

    //name is changed to _name
    public String _name = "Sherrin";

    public static void massage() {
        // 10017 is cganged to 10_0_17
        int zip = 10_0_17;
    }

    public static void main(String[] args) {
        massage();
    }
}
