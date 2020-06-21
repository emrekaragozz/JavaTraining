package hw10;

interface Plant {
    default String grow() { return "Grow!"; }
}

interface Living {
    public default String grow() { return "Growing!"; }
}
public class Q26 implements Plant { // m1
    public String grow(int height) { //overloaded method
        return "Super Growing!";
    }

    public static void main(String[] leaves) {
        Plant p = new Q26(); // m2
        System.out.print(((Living) p).grow()); // m3 }
    }
}