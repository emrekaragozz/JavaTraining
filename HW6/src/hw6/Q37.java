package hw6;

// Class name must be same with the file name, Puppy is changed with Q37.
public class Q37 {
    public static int wag = 5; // q1
    public void Q37(int wag) { // q2
    this.wag = wag;
    }
    public static void main(String[] tail) {
        System.out.print(new Q37().wag); // q3
    }
}