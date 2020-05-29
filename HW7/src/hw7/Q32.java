package hw7;

class Rotorcraft {
    protected final int height = 5;
    int fly() {return height;}; //cannot be abstract because Rotorcraft is not abstract
}
public class Q32 extends Rotorcraft {
    private int height = 10;
    protected int fly() {
        return super.height;
    }
    public static void main(String[] unused) {
        //Q32 h = (Q32)new Rotorcraft(); // Rotorcraft cannot be cast to Q32
        Q32 h =  new Q32();
        System.out.print(h.fly());
    }
 }