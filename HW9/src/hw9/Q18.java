package hw9;

public class Q18 {
    public static void main(String[] args) {
        String teams = new String("694");
        teams.concat(" 1155"); //returns a new object
        teams.concat(" 2265"); //returns a new object
        teams.concat(" 2869"); //returns a new object

        //teams is still "694"
        System.out.println(teams);
    }
}
