package hw5;

public class Q28 {
    public static void main(String[] args) {
        String letters = "";

        //an infinite loop, letters.length() is increased by 2
        while (letters.length() != 3) //never ends
            letters+="ab";
        System.out.println(letters);
    }
}
