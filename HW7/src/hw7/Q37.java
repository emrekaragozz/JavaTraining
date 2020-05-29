package hw7;

interface SpeakDialogue { default int talk() { return 7; } }
interface SingMonologue { default int talk() { return 5; } }

public class Q37 implements SpeakDialogue, SingMonologue {
    public int talk(String... x) {
        return x.length;
    }

    public int talk() { //was inserted
        return 3;
    }

    public static void main(String[] notes) {
        System.out.print(new Q37().talk(notes));
    }
}