package hw9;

import java.util.Arrays;
import java.util.List;

public class Q21 {
    public static void main(String[] args) {
        String[] array = {"Natural History", "Science"};
        List<String> museums = Arrays.asList(array);
        museums.set(0, "Art");
        System.out.println(museums.contains("Art"));
    }
}
