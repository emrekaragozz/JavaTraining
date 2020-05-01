package hw3;

public class Q30 {
    public static void main(String[] args) {
        int x=10, y=5;
        boolean w=true, z=false;
        x = w ? y++ : y--; // x=5, y=6
        w=!z; // w is still true
        System.out.print((x+y)+" "+(w ? 5 : 10)); // (5+6)+" "+5
    }
}
