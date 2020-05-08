package hw4;

import java.util.Arrays;

//Class name must be same with the file name, EchoFirst is changed to Q50
public class Q50 { // with argument "seed" and "flower"
    public static void main(String[] args) { Arrays.sort(args);
        //String result = Arrays.binarySearch(args, args[0]); prevents from compiling
        int result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}
