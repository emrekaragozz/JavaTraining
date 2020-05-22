package hw6; //package name sky is changed to hw6

public class Q32 {
    private int inThe = 4;
    public void Q32() {
        // super(); cannot be called here, this is not a constructor method
    }
    public Q32(int inThe) {
        this.inThe = this.inThe;
    }
    public static void main(String[] endless) {
        System.out.print(new hw6.Q32(2).inThe);
    }
}