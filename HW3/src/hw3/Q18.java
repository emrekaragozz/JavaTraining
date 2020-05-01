package hw3;

public class Q18 {
    public static void main(String[] args) {
        int dayOfWeek = 6;
        final int saturday = 6;
        //final long saturday = 6;

        switch(dayOfWeek) {
            default:
                System.out.print("Another Weekday");
                break;
            case saturday:
                System.out.print("Weekend!");
        }
    }
}
