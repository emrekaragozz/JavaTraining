package hw4;

public class Q18 {
    public static void main(String[] args) {
        // char[][] ticTacToe = new char[3,3]; // r1 is not a legal declaration

        char[][] ticTacToe = new char[3][3];
        // ticTacToe[1][3] = 'X'; // r2 throws ArrayIndexOutOfBoundsException
        ticTacToe[2][2] = 'X';
        //ticTacToe[3][1] = 'X'; // throws ArrayIndexOutOfBoundsException
        System.out.println(ticTacToe.length + " in a row!"); // r3
    }
}
