package hw8;

class BigCat {
    void roar(int level) {
        // unchecked exception so it do not have to declare or handle.
        if (level < 3) throw new IllegalArgumentException("Incomplete");
        System.out.print("Roar!");
    }
}

public class Q32 extends BigCat {
    public void roar() { // m2
        System.out.print("Roar!!!");
    }

    public static void main(String[] cubs) {
        final BigCat kitty = new Q32(); // m3
        kitty.roar(2);
    }
}
