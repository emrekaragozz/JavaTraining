package hw4;

public class Q35 {
    public static void main(String[] args) {
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday" };

        for (int i = 1; i < days.length; i++)
            System.out.println(days[i]);

        /*  for (int i = 1; i <= days.length; i++) //length is 7
                System.out.println(days[i]); //ArrayIndexOutOfBoundsException
            */
    }
}
