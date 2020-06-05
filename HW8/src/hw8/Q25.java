package hw8;

public class Q25 {
    // private Boolean[] list = {true, false}; // ArrayIndexOutOfBoundsException is thrown
    // private Boolean[] list = (Boolean[]) new Object(); // ClassCastException is thrown
    // private Boolean[] list = null; // NullPointerException

    private Boolean[] list = {true, false, true, false, true, false,
            true, false, true, false}; //compiles without and issue


    public int printTodaysCount() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (list[i])
                ++count;
        }
        return count;
    }

    public static void main(String[] roster) {
        new Q25().printTodaysCount();
    }
}
