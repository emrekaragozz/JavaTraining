package hw5;

public class Q46 {
    public static void main(String[] args) {
        for (int k=0; k < 5; k++) { //iterates 5 times
            System.out.println("This line belongs to Option A");
        }

        for (int k=1; k <= 5; k++) { //iterates 5 times
            System.out.println("This line belongs to Option B");
        }

        int k=0;
        do { //iterates 6 times
                System.out.println("This line belongs to Option C");
            } while(k++ < 5);

        int l=0; while (l++ < 5) { //iterates 5 times
            System.out.println("This line belongs to Option D");
        }
    }
}
