package hw5;

import java.util.Arrays;
import java.util.List;

public class Q12 {
    public static void main(String[] args) {
        List<String> drinks = Arrays.asList("can", "cup");
        for (int container = drinks.size() - 1; container >= 0; container--)
            System.out.print(drinks.get(container) + ",");
    }
}
