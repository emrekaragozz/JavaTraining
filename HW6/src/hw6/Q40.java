package hw6;

// Class name must be same with the file name, Drink is changed with Q40.
public class Q40 {
    public static void water() {}
    public void get() {
        water();
        Q40.water();
        this.water();
        //this.Q40.water();
    }
}