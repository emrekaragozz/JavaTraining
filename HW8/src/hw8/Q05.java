package hw8;

public class Q05 {
    public static void main(String... teams) {
        int score = 1;
        try {
            //if "score" declared here, it only be accessible from this scope.
            System.out.print(score++);
        } catch (Throwable t) {
            System.out.print(score++);
        } finally {
            System.out.print(score++);
        }
        System.out.print(score++);
    }
}
