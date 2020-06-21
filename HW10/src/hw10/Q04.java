package hw10;

public class Q04 {
    public static void main(String[] args) {
        int[] crossword [] = new int[10][20];
        for (int i = 0; i < crossword.length; i++)
            for (int j = 0; j < crossword.length; j++)
                crossword[i][j] = 'x';
        System.out.println(crossword.length);

        //Integer.valueOf('x') is assigned to the half of the elements
        //The other elements are equals to zero

        System.out.println(Integer.valueOf('x')); //120
        System.out.println(crossword[0][9]); //120
        System.out.println(crossword[0][10]);

        //'x' is assigned to the half of the elements
        // the other elements are equals to zero
    }
}
