package hw7;

public class Q03 {
    public void playMusic() { //cannot be have the same method signature with the other method
        System.out.print("Play!");
    }
    private static int playMusic2() { //must return a value
        System.out.print("Music!");
        return 0;
    }
    public static void main(String[] tracks) {
        new Q03().playMusic();
    }
}