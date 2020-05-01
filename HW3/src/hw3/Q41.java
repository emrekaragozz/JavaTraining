package hw3;

// Class name must be same with the file name, CountEntries is changed to Q41.
public class Q41 {
    public static int getResult(int threshold) {
        return threshold > 5 ? 1 : 0; } //is always false and returns 0
    public static final void main(String[] days) {
        System.out.print(getResult(5)+getResult(1)
                +getResult(0)+getResult(2)+""); // 0+0+0+0=0
    }
}
