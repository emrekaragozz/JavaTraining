package hw5;

public class Q34 {
    public static void main(String[] args) {
        String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
        String[] times = new String[] { "Day", "Night" };
        for (int i = 0, j = 0; i < nycTourLoops.length
                && j < times.length; i++, j++) { //update statements should be separated
            System.out.print(nycTourLoops[i] + " " + times[j] + "-"); } // outputs "Downtown Day-Uptown Night-"

    }
}
