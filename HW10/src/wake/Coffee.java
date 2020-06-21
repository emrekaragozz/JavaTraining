package wake;

public class Coffee {
    private boolean bringCoffee() {
        return new Alarm().clock < 10;
    }
}
