package hw3;

public class Q6 {
    public static void main(String[] args) {
        long thatNumber = 5 >= 5 ? 1+2 : 1*1; // 3 is assigned to thatNumber
        if(++thatNumber < 4) // thatNumber is increased by 1, now it equals to 4
            thatNumber += 1; // this line is skipped
        System.out.println(thatNumber); // prints 4
    }
}
