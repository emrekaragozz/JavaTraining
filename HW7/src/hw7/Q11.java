package hw7;

class Computer {
    protected int process() { //cannot be overridden while it's final
        return 5;
    }
}
public class Q11 extends Computer {
    public final int process() {
        return 3;
    }
    public static void main(String[] chips) {
        System.out.print(new Q11().process());
    }
}