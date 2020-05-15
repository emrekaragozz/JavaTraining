package hw5;

public class Q17 {
    public static void main(String[] args) {
        do {
            int count = 0;
            do {
                count++;
            } while (count < 2);
            break;
        } while (true);
        // System.out.println(count); count is not accessible
    }
}
