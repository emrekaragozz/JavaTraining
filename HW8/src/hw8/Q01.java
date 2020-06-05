package hw8;

public class Q01 {
    public static void think() throws Exception { // k1

//a try statement needs a catch block or a finally block
        try {
            throw new Exception();
        } catch (Exception e) {
            //inserted
        } finally {
            //inserted
        }
    }

    public static void main(String... ideas) throws Exception {
        think();
    }
}
