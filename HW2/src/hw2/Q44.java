package hw2;

// Class name must be same with the file name, Penguin is changed to Q44
public class Q44 {
    private double beakLength;
    public static void setBeakLength(Q44 p, int b) {
        p.beakLength = b;
        //p['beakLength'] = b; invalid syntax
        //p[beakLength] = b; array type is expected
    }
}

