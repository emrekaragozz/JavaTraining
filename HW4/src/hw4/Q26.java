package hw4;

public class Q26 {
    public static void main(String[] args) {
        char[][] ticTacToe = new char[3][3]; // r1
        //ticTacToe[1][3] = 'X'; // r2 ArrayIndexOutOfBoundsException
        ticTacToe[2][2] = 'X';
        // ticTacToe[3][1] = 'X'; ArrayIndexOutOfBoundsException
        System.out.println(ticTacToe.length + " in a row!"); // r3
    }
}
