package hw7;

abstract class Car {
    static { System.out.print("1"); } //First
     Car(String name) {
        super();
        System.out.print("2"); //Third
    }
    { System.out.print("3"); } //Second
}
public class Q27 extends Car {
    { System.out.print("4"); } //Fourth
    public Q27() {
    super("blue");
    System.out.print("5"); //Fifth
}
    public static void main(String[] gears) {
    new Q27();
    }
}