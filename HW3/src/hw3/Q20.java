package hw3; // recreation is changed to hw3

// Class name must be same with the file name, Dancing is changed to Q20.
public class Q20 {
    public static void main(String[] vars) {
        int leaders = 10 * (2 + (1 + 2 / 5));
        int followers = leaders * 2;
        System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
    }
}
