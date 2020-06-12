package hw9;

import java.time.LocalDate;

public class Q50 {
    public static void main(String[] args) {
        LocalDate xmas = LocalDate.of(2016, 12, 25);
        //xmas.setYear(2017);
        //LocalDate is immutable. This class does not have a setter method
        System.out.println(xmas.getYear());
    }
}
