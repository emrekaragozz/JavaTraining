package hw9;

import java.time.*;
import java.time.format.*;

public class Q38 {
	public static void main(String[] args) {
		LocalDate newYears = LocalDate.of(2017, 1, 1); // "2017-01-01" ("yyyy-MM-dd")
		//System.out.println(newYears);
		Period period = Period.ofDays(1); //"1" day
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy"); 
		System.out.print(format.format(newYears.minus(period))); //12-31-2016
	}
}
