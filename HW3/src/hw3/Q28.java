package hw3;// city is changed to hw3

// Class name must be same with the file name, Road is changed to Q28.
public class Q28 {
    public static void main(String... in) {
        int intersections = 100;
        int streets = 200;
        if (intersections < 150) {
            System.out.print("1");
        } else if (streets > intersections && intersections > 1000) {
            System.out.print("2");
        }
        if (streets < 500)
            System.out.print("1");
        else
            System.out.print("2");
    }
}

