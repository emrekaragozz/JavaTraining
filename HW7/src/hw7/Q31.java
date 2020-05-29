package hw7;

abstract class Parallelogram {
    private int getEqualSides() {return 0;}
}
abstract class Rectangle extends Parallelogram {
    public static int getEqualSides() {
        return 2;
    } // x1
}
public final class Q31 extends Rectangle {
    public static int getEqualSides() { //must be static to override “getEqualSides()” in “hw7.Rectangle”.
        return 4;
    } //x2
    public static void main(String[] corners) {
        final Q31 myFigure = new Q31(); // x3
        System.out.print(myFigure.getEqualSides());
    }
}