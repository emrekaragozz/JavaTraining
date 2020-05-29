package hw7;

interface CanFly {
    public void fly(); //body was removed
}
class Bird { //final keyword was removed to be extended
    public int fly(int speed) {
        return speed; //return statement was inserted
    }
}
public class Q35 extends Bird implements CanFly {
    public void fly() {}
}