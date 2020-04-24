package hw2; //package name store is changed to hw2

// Class name must be same with the file name, Toy is changed to Q43
public class Q43 {
    public void play() {
        System.out.print("play-");
    }
    public void finalizer() { // this method is never used
        System.out.print("clean-"); }
    public static void main(String[] fun) { Q43 car = new Q43();
        car.play();
        System.gc();
        Q43 doll = new Q43();
        doll.play();
    }
}
