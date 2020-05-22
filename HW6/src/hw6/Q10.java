package hw6;

// Class name must be same with the file name, Jump is changed with Q08.
public class Q10 {
    private int rope = 1;
    protected boolean outside;
    public Q10() {
        // rope=4; prints 4
        // new Q10(4); prints 1
        //this(5); prints 6
        this(4); // prints 5
        outside = true; }
    public Q10(int rope) {
        this.rope = outside ? rope : rope+1;
    }
    public static void main(String[] bounce) {
        System.out.print(new Q10().rope);
    }
}