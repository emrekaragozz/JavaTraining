package hw3;// mode is changed to hw3

// Class name must be same with the file name, Transportation is changed to Q25.
public class Q25 {
    public static String travel(int distance) {
        //return distance<1000 ? "train" : 10; 10 is not compatible with a String
        return distance<1000 ? "train" : "correct return type";
    }
    public static void main(String[] answer) {
        System.out.print(travel(500));
        System.out.print(travel(1000));
    }
}
