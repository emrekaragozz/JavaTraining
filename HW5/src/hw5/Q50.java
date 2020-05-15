package hw5; //nyc is changed to hw5

public class Q50 { //TouristBus is changed to
    public static void main(String... args) {
        String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
        String[] times = new String[] { "Day", "Night" };
        for (int i=0, j=0 ;i < 1; i++, j++)
            System.out.println(nycTourLoops[i] + " " + times[j]);
    }
}
