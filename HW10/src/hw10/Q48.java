package hw10;

public class Q48 {
    public int drive(long car) {
        return 2;
    }

    public int drive(double car) {
        return 3;
    }

    public int drive(int car) {
        return 5;
    }

    public int drive(short car) {
        return 3;
    }

    public static void main(String[] gears) {
        //boolean value = 5; invalid declaration
        //short value = 5; //prints 3
        //int value = 5; //prints 5
        //byte value = 5; //prints 3
        //long value = 5; prints 2
        float value = 5; //prints 3

        System.out.print(new Q48().drive(value));
    }
}
