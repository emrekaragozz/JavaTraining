package hw4; // package fun is changed to hw4

//Class name must be same with the file name, Sudoku is changed to Q28
public class Q28 {
    static int[][] game = new int[6][6];
    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        int[] assign = new int[] {1,2,3};
        obj[3] =  assign;
        System.out.println(game[3][3]);
    }
}
