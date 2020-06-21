package hw10;

public class Q73 {
    public static void main(String[] args) {

        //there is not a variable type such as string in JAVA

        String bike1 = "speedy";
        String bike2 = new String("speedy");
        boolean test1 = bike1 == bike2; //is always false
        boolean test2 = bike1.equals(bike2); //is always false
        System.out.println(test1 + " " + test2);
    }
}
