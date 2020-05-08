package hw4; // package fun is changed to hw4

//Class name must be same with the file name, Sudoku is changed to Q42
public class Q42 {
    static int[][] game = new int[4][4];
    //static int[][] game;
    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        //game[3][3] = "X"; // we are not allowed to assign a String to int array
        game[3][3] = 1;
        System.out.println(game[3][3]);
    }
}
