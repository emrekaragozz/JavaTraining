package hw3;// dessert is changed to hw3

// Class name must be same with the file name, IceCream is changed to Q24.
public class Q24 {
    public final static void main(String... args) {
        int flavors = 30;
        int eaten = 0;
        switch(flavors) {
            case 30: ++eaten; // eaten is 1
            case 40: eaten+=2; // eaten is 3
            default: eaten--; // eaten is 2
        }
        System.out.print(eaten); } //prints 2
}
