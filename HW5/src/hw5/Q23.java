package hw5;

public class Q23 {
    public static void main(String[] args) {
        letters: for (char ch='a'; ch<='z'; ch++) {
            numbers: for (int n=0; n<=10; n++) {
                System.out.println(ch);
                break numbers; //breaks out of the inner loop
                //break;
        }
    }
    }
}
