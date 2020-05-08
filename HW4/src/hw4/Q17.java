package hw4;

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        String[] os = new String[] { "Mac", "Linux", "Windows" };
        Arrays.sort(os); // { "Linux", "Max", "Windows" };
        System.out.println(Arrays.binarySearch(os, "Mac")); // prints 1
    }
}
