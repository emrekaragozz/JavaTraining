package hw9;

public class Q11 {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-"); //also returns reference to line
        System.out.print(line == anotherLine); // always true
        System.out.print(" ");
        System.out.print(line.length()); // prints "true 2"
    }
}
