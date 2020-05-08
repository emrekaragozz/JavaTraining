package hw4;

import java.util.Arrays;

public class Q41 {
    public static void main(String[] args) {
        String[] os = new String[] { "Mac", "Linux", "Windows" }; //not sorted
        System.out.println(Arrays.binarySearch(os, "Linux")); //output is undefined
    }
}
