package hw9;

import java.time.*;
import java.time.format.*;

public class Q45 {
    public static void main(String[] args) {
        LocalDate newYears = LocalDate.of(2017, 1, 1);
        Period period = Period.ofDays(1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy");

        //Lowercase 'mm' (minute) pattern is used
        //UnsupportedTemporalTypeException is thrown
        System.out.print(format.format(newYears.minus(period)));
    }
}
