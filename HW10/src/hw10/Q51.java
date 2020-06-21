package hw10;

import java.util.Arrays;
import java.util.List;

public class Q51 {
    public static void main(String[] args) {
        List<String> drinks = Arrays.asList("can", "cup");

        // drinks.size() returns 2

        for (int container = drinks.size(); container > 0; container++) {
            System.out.print(drinks.get(container - 1) + ",");
        }
    }
}
