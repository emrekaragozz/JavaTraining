package hw3; // transporter is changed to hw3

// Class name must be same with the file name, Rematerialize is changed to Q23.
public class Q23 {
    public static void main(String[] input) {
        int dog = 11;
        int cat = 3;
        int partA = dog / cat; //rounded down to 3
        int partB = dog % cat; // 2
        int newDog = partB + partA * cat; // (2+3*3)=11
        System.out.print(newDog); // prints 11
    }
}
