package hw7;

class Automobile {
    private final String drive() {
        return "Driving vehicle";
    }
}

class Car2 {
    protected String drive() {
        return "Driving car"; }
}

public class Q07 extends Car2 {
    public final String drive() {
        return "Driving electric car";
    }
    public static void main(String[] wheels) {
        final Car2 car = new Q07();
        //final Car2 car = new Car();

        //calls method from ElectricCar and prints "Driving electric car"s
        System.out.print(car.drive());
    }
}