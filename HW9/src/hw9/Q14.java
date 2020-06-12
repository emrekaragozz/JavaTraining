package hw9;

import java.util.ArrayList;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.set(1, 'c'); // ‘b’ is set to ‘c’
        chars.remove(0); //a is removed
        System.out.print(chars.size() + " " + chars.contains('b')); //prints "1 false"
    }
}
