package hw8;

abstract class Duck {
    protected int count; // default value is 0

    public abstract int getDuckies();
}

public class Q30 extends Duck {
    private int age;

    public Q30(int age) {
        this.age = age;
    }

    public int getDuckies() {
        return this.age / count;
    }

    public static void main(String[] pondInfo) {
        Duck itQuacks = new Q30(5);
        System.out.print(itQuacks.getDuckies()); // throws ArithmeticException because "count" is 0
    }
}
