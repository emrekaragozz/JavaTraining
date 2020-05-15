package hw5;

import java.util.Arrays;
import java.util.List;

public class Q13 {
    public static void main(String[] args) {
        List<String> bottles = Arrays.asList("glass", "plastic");
        for (int type = 0; type < bottles.size();) { //an incrementor is needed
            System.out.print(bottles.get(type) + ",");
            break; //skips all remaining executions
        }
        System.out.print("end"); }
}
