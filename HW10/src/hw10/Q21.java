package hw10;

public class Q21 {
    static int teeth; // is set to 0
    double scaleToughness; //is never used

    public Q21() {
        teeth++;
    }

    public void snap(int teeth) {
        System.out.print(teeth + " ");
        teeth--; //is never used. This is not the "static int teeth"
    }

    public static void main(String[] unused) {
        System.out.println(teeth);
        new Q21().snap(teeth);
        new Q21().snap(teeth);
    }
}
