package hw3;

public class Q46 {
    public static void main(String... weather) {
        // java.lang.ArrayIndexOutOfBoundsException is thrown
        System.out.print(weather[0]!=null && weather[0].equals("sunny") && !false
                ? "Go Outside" : "Stay Inside");
    }
}
