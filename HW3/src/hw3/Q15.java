package hw3;

public class Q15 {
    public static void main(String[] args) {
        int hops = 0;
        int jumps = 0;
        jumps = hops++;

        //if(jumps) this line throws an error. test statement must be a boolean, jumps is an int
        if(jumps<0)
            System.out.print("Jump!");
        else
            System.out.print("Hop!");
    }
}
