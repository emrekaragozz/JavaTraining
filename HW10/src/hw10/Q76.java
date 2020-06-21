package hw10;

import java.time.LocalDate;
import java.time.LocalTime;

public class Q76 {
    public static void main(String... nums) {

        //LocalDate is changed to LocalTime

        LocalTime time = LocalTime.of(1, 11);

        //the loop is never entered
        while (time.getHour() < 1) {
            time.plusHours(1);
            System.out.println("in loop");
        }
    }
}