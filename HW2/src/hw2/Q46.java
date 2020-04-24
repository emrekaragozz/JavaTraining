package hw2;

// Class name must be same with the file name, Person is changed to Q46
public class Q46 {
    public Q46 youngestChild;
    public static void main(String... args) {
        Q46 elena = new Q46();
        Q46 diana = new Q46();
        elena.youngestChild = diana;
        diana = null;
        Q46 zoe = new Q46();
        elena.youngestChild = zoe;
        zoe = null;
    }
}
