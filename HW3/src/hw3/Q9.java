package hw3; // registration is changed to hw3

// Class name must be same with the file name, Election is changed to Q9.
public class Q9 {
    public void calculateResult(Integer candidateA, Integer candidateB) {
        boolean process = candidateA == null || candidateA.intValue() < 10; //null pointer exception
        //boolean value = candidateA && candidateB; cannot be applied on Integers
        //System.out.print(process || value);
        System.out.print(process);
    }
    public static void main(String[] unused) {
        new Q9().calculateResult(null,203); }
}
