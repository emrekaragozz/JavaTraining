package hw7;

class Ship {
    protected int weight = 3;
    protected int height = 5; //private causes an error
    public int getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }
}
public class Q16 extends Ship {
    public int weight = 2;
    public int height = 4;
    public void printDetails() {
        System.out.print(super.getWeight()+","+super.height);
    }
    public static final void main(String[] fuel) {
        new Q16().printDetails();
    }
}
