package hw5;

public class Q49 {
    public static void main(String[] args) {
        boolean baloonInflated = false;
        do {
            if (!baloonInflated) {
                baloonInflated = true;
                System.out.print("inflate-");
            }
        } while (!baloonInflated);
        // condition is changed to false prevent the code from an infinite loop
        System.out.println("done");
    }
}

