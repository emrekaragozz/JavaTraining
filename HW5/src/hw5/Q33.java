package hw5;

import java.util.Arrays;
import java.util.List;

public class Q33 {
    public static void main(String[] args) {
        List<String> bottles = Arrays.asList("glass", "plastic");
        for (int type = 0; type < bottles.size();) {  //curly brackets are added
            System.out.print(bottles.get(type) + ",");
            break;
        }
        System.out.print("end");
    }
}
