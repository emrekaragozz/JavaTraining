package hw2;

public class Q2 {
    public static void main(String... args) {
        // String chair, table = "metal"; the local variable “chair” is not initialized here
        String chair="", table = "metal"; // now, “chair” is initialized
        chair = chair + table; System.out.println(chair);
    }
}
