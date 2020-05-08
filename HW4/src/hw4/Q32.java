package hw4; // package unix is changed to hw4

import java.util.Arrays;

//Class name must be same with the file name, EchoFirst is changed to Q31
public class Q32 {
    public static void main(String[] args) { //with arguments seed and flower
        String one = args[0]; // seed is assigned to one
        Arrays.sort(args); // {"flower", "seed"}
        int result = Arrays.binarySearch(args, one); // searches for index of seed
        System.out.println(result); //result is 1
    }
}
