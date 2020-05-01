package hw3; // restaurant is changed to hw3

// Class name must be same with the file name, Pieces is changed to Q12.
public class Q12 {
    public static void main(String[] info) {
        int flair = 15;
        if(flair >= 15 && flair < 37) { // is always true
            System.out.print("Not enough");
        }

        if(flair==37) {
            System.out.print("Just right"); // is skipped
        } else {
            System.out.print("Too many"); // is evaluated
        }
        // "Not enoughToo many" is the output
    }
}
