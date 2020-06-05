package hw8;

public class Q10 {
    public void openDrawbridge() throws Exception { // p1
        try {
            throw new Exception("Circle");
        } catch (Exception e) {
            System.out.print("Opening!");
        } finally {
            System.out.print("Walls"); // p2
        }
    }

    public static void main(String[] moat) {
        // main method must declare or handle the exception
        // in order to compile try-catch block is inserted
        try {
            new Q10().openDrawbridge(); // p3-
        } catch (Exception e) {
        }
    }
}
