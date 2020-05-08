package hw4;

public class Q45 {
    public static void main(String[] args) {
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday" };
        for (int i = 1; i < days.length; i++)
            System.out.println(days[i]); //prints 6 lines except days[0]
    }
}
