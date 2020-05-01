package hw3;// tornado is changed to hw3

// Class name must be same with the file name, Kansas is changed to Q38.
public class Q38 {
    public static void main(String[] args) {
        int colorOfRainbow = 10;
        final int red = 5; // final attribute was added
        switch(colorOfRainbow) {
            default:
                System.out.print("Home");
                break;
            case red:
                System.out.print("Away");
        }
    }
}

