package hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q47 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("-5");
        list.add("0");
        list.add("5");
        print(list, e -> e.equals("5"));
    }

    //num is String, Integer was needed
    //Predicate<Integer> is changed to Predicate<String>
    public static void print(List<String> list, Predicate<String> p) {
        for (String num : list)
            if (p.test(num)) System.out.println(num);
    }
}