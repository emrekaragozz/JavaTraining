package hw10;

import java.util.concurrent.locks.Condition;

public class Q61 {
    public static void main(String[] args) {

        // '1 + 2 * 5>=2' is always 'true'

        int fish = 1 + 2 * 5>=2 ? 4 : 2; // fish = 4


        //Condition '3 < 3' is always 'false'
        //Condition '5>=5' is always 'true'
        int mammals = 3 < 3 ? 1 : 5>=5 ? 9 : 7;  //mammals = 9

        System.out.println(fish);
        System.out.println(mammals);

        System.out.print(fish+mammals+""); //prints 13
    }
}
