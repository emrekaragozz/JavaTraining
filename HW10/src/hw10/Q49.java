package hw10;

import java.time.LocalTime;

public class Q49 {
    public static void main(String[] args) {
        System.out.println(new StringBuilder("zelda")
                == new StringBuilder("zelda"));
        System.out.println(3 == 3); //true
        System.out.println("bart" == "bart"); //true
        System.out.println(new int[0] == new int[0]);
        System.out.println(LocalTime.now() == LocalTime.now());
    }
}
