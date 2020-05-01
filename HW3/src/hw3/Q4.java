package hw3; // planning is changed to hw3

// Class name must be same with the file name, ThePlan is changed to Q4.
public class Q4 {
    public static void main(String[] input) {
        int plan = 1;
        plan = plan++ + --plan; // (2+0=2)

        System.out.println(plan); // prints 2

        if(plan==1) {
            System.out.print("Plan A");
        } else {
                if(plan==2) System.out.print("Plan B");
                else System.out.print("Plan C");
                }
        // else System.out.print("Plan C"); this else statement is not connected an if statement
    }
}
