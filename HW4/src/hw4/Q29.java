package hw4;

import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {
        String[] os = new String[] { "Mac", "Linux", "Windows" };
        Arrays.sort(os); // { "Linux", "Mac", "Windows" };

        //{ "Linux", "Mac", "RedHat", "Windows" };
        System.out.println(Arrays.binarySearch(os, "RedHat")); // prints -3
    }
}
