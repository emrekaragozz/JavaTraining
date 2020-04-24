package hw2; //package name beach is changed to hw2

// Class name must be same with the file name, Toy is changed to Q43
public class Q50 {
        public Q50() {
            System.out.print("a"); // outputs "a"
        }
        public void Q50() {
            System.out.print("b"); }
        public void run() {
            new Q50();
            Q50(); // outputs "b"
        }
        public static void main(String... args) {
            new Q50().run(); // outputs "a"
        }
    }

