package hw2;

// Class name must be same with the file name, InitOrder is changed to Q37.
public class Q37 {
    public String first = "instance";
    public Q37() {
        first="constructor";
    }
    {
        first="block";
    }
    public void print() {
        System.out.println(first);
    }

    public static void main(String... args) {
        new Q37().print();
    }
}
