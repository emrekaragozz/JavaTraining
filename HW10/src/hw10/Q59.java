package hw10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Q59 {
    public static void main(String h) {
        LocalDate newYears = LocalDate.of(2017, 1, 1);
        Period period = Period.ofYears(1).ofDays(1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.print(format.format(newYears.minus(period)));
    }
}
