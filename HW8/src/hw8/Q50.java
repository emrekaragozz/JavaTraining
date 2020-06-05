package hw8;

public class Q50 {
    public static void snore() {
        try {
            String sheep[] = new String[3];
            System.out.print(sheep[3]);
        } catch (RuntimeException e) {
            System.out.print("Awake!");
        } finally {
            try {
                throw new Exception(); // x1 - Exception is handled in order to compile the code
            } catch (Exception e) {

            }
        }
    }

    public static void main(String... sheep) { // x2
        new Q50().snore(); // x3
    }
}
