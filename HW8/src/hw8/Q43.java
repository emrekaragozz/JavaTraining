package hw8;

public class Q43 {
    public static void dancing() throws RuntimeException {
        try {
            throw new IllegalArgumentException();
        } catch (Error e) { //variable name is inserted
            System.out.print("Unable!");
        }
    }

    public static void main(String... count) throws RuntimeException {
        dancing(); //IllegalArgumentException is thrown
    }
}