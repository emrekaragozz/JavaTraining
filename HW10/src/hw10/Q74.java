package hw10;

import java.util.*;

public class Q74 {
    public static void main(String[] args) { //args: seed flower plant
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}