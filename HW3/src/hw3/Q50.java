package hw3;
// Class name must be same with the file name, Baby is changed to Q50.
public class Q50 {
    public static String play(int toy, int age) {
        final String game;
        if(toy<2)
            game = age > 1 ? "Monopoly" : "Mario"; // p1, int values changed to String
        else
            game = age > 3 ? "Ball" : "Swim"; // p2
            return game;
    }
    public static void main(String[] variables) {
        System.out.print(play(5,2)); }
}
