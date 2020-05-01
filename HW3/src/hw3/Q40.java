package hw3;// transporter is changed to hw3

// Class name must be same with the file name, TurtleVsHare is changed to Q40.
public class Q40 {
    public static void main(String[] arguments) {
        int turtle = 10 * (2 + (3 + 2) / 5);
        int hare = turtle < 5 ? 10 : 25; // false
        System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!"); //false
    }
}
