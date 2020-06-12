package hw9;

import java.util.ArrayList;

public class Q12 {
    public static void secret(ArrayList<String> mystery) {
        mystery.add("metal");
        String str = mystery.get(0);
        int num = mystery.size(); //length() cannot be used

        System.out.println(str +" "+ num);
    }
}
