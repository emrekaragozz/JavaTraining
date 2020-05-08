package hw4;

import java.util.Arrays;

public class Q47 {
    public static void main(String[] args) {
        String[] os = new String[] { "Linux", "Mac", "Windows" }; //sorted array
        System.out.println(Arrays.binarySearch(os, "Linux")); //returns the index of "linux" (0)
    }
}
