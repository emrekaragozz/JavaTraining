package hw8;

//Exception and RuntimeException were replaced each other
class Organ {
    public void operate() throws Exception {
        throw new RuntimeException("Not supported");
    }
}

public class Q38 extends Organ {
    public void operate() throws RuntimeException {
        System.out.print("beat");
    }

    public static void main(String... cholesterol) throws Exception {
        try {
            new Q38().operate();
        } finally {
        }
    }
}