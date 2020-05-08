package hw4;

import java.util.Arrays;

public class Q25 {
    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings); // prints [Ljava.lang.String;@61bbe9ba
        System.out.println(Arrays.toString(strings)); // prints [null, null]
    }
}
