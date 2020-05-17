package hw5;

import java.util.ArrayList;
import java.util.List;

public class Q00 {
    public static void main(String[] args) {
        List<String> strList =new ArrayList<>();

        strList.add("A");
        strList.add("B");
        strList.add("C");

        /*for (String str: strList) {
            if (str.equals("A")) {
                strList.remove(str); //java.util.ConcurrentModificationException
            }
        }*/

        for (int i=0; i<strList.size();i++) {
            if (strList.get(i).equals("A")) {
                strList.remove(i);
            }
        }
        System.out.println(strList);
    }
}
