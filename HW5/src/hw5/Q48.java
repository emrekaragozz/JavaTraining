package hw5;

public class Q48 {
    public static void main(String[] args) {
        int result = 8;
        f: while (result > 7) { // for is changed f, for is a keyword
            result++; do {
                result--;
            } while (result > 5);
            break f;
        } System.out.println(result);
    }
}
