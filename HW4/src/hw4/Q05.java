package hw4;
import java.util.Arrays;

public class Q05 {

    public static void printStormName(String... names) { //static keyword is added
        System.out.println(Arrays.toString(names));
    }
    public static void printStormNames(String[] names) { //static keyword is added
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {
        printStormName("Arlene");
        printStormName(new String[] { "Bret" });
        //printStormNames("Cindy"); does not compile. "Cindy" is a String, not an array.
        printStormNames(new String[] { "Don" });
    }

}
