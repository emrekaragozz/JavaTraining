package hw9;

import java.util.ArrayList;
import java.util.List;

public class Q48 {
    public static void main(String[] args) {
        List<String> magazines = new ArrayList();
        magazines.add("Readers Digest");
        magazines.add("People");
        magazines.clear();
        magazines.add("The Economist");

        // throwsIndexOutOfBoundsException
        magazines.remove(1); //index 1 does not exist
        System.out.println(magazines.size());
    }
}
