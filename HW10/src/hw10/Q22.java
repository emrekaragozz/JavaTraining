package hw10;

public class Q22 {
    public static void main(String[] black) {
        String witch = "b";
        String tail = "lack";

        //“String” is an immutable class,
        // result of “String.concat()” is ignored
        witch.concat(tail);
        System.out.println(witch); //prints "b"
    }
}