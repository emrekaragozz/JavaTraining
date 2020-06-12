package hw9;

import java.time.Period;

public class Q37 {
	public static void main(String[] args) {
		Period period1 = Period.ofWeeks(1).ofDays(3); // every 3 days
    
    /*
    Period period1 = Period.ofWeeks(1);
    period1 = Period.ofDays(3) //every 3 days
    */
    
		Period period2 = Period.ofDays(10); // every 10 days
	}
}
