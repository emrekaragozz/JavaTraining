package hw5; //chicago is changed to hw5

public class Q16 { //Loop is changed to Q16
    private static int count; //defaults to 0
    private static String[] stops = new String[] { "Washington",
            "Monroe", "Jackson", "LaSalle" };
    public static void main(String[] args) {
        while (count < stops.length) { //is executed 2 times
            if (stops[count++].length() < 8) {
                break;
            }
        }
        System.out.println(count); //count is 2 here
    }
}
