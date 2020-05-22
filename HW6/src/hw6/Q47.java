package hw6;

public class Q47 {
    public static Long getScore(Long timeRemaining) {
        return 2*timeRemaining; // m1
    }
    public static void main(String[] refs) {
        final long startTime = 4; //int is changed with long
        System.out.print(getScore(startTime)); // m2
    }
}