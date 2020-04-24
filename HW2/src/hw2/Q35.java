package hw2;

public class Q35 {
    public static void main(String[] fruits) {
        String fruit1 = new String("apple");
        String fruit2 = new String("orange");
        String fruit3 = new String("pear");

        fruit3=fruit1;
        fruit2=fruit3;
        fruit1=fruit2;

        // now, all of these references point to String apple

        System.out.println(fruit1+" "+fruit2+" "+fruit3);
    }
}
