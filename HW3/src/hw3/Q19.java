package hw3;

public class Q19 {
    public static void main(String[] args) {
        int time = 11;
        //int day = 4;
        boolean day = true;
        String dinner = time > 10 ? (day ? "Takeout" : "Salad") : "Leftovers";
         System.out.println(dinner);
    }
}
