package hw5;

public class Q40 {
    public static void main(String[] args) {
        int count=0;
        do {
            do { //2times
                count++;
            }while (count < 2);
            break;
        }while (true);
        System.out.println(count); //2
    }
}


