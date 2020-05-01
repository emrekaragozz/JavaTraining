package hw3;// bob is changed to hw3

// Class name must be same with the file name, AreYouBob is changed to Q31.
public class Q31 {
    public static void main(String[] unused) {
        String bob = new String("bob");
        String notBob = bob;
        System.out.print((bob==notBob)+" "+(bob.equals(notBob)));
    }
}
