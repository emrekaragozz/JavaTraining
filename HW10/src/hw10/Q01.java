package hw10;

public class Q01 {
    public static void main(String... books) { //arguments: cars carts
        StringBuilder sb = new StringBuilder();
        for (String book : books)
            //StringIndexOutOfBoundsException is thrown
            sb.insert(sb.indexOf("c"), book); //sb is empty
        System.out.println(sb);
    }
}