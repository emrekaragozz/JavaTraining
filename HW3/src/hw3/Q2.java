package hw3;

public class Q2 {
    public static void main(String[] args) {
        int meal = 5;
        int tip = 2;
        int total = meal + (meal>6 ? ++tip : --tip);  //decreased tip by 1 returns 1
        // int total = meal + (meal>6 ? ++tip : tip--); returns 2 and decreased tip by 1

        System.out.println(tip); // prints 1
        System.out.println(total); // prints 6
    }
}
