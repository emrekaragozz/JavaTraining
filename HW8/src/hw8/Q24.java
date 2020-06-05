package hw8;

public class Q24 {
    public void compute() throws Exception {
        throw new RuntimeException("Error processing request");
    }

    //Checked exceptions must be declared or handle
    public static void main(String[] bits) throws Exception { //declared
        try {
            new Q24().compute();
            System.out.print("Ping");
        } catch (NullPointerException e) {
            System.out.print("Pong");
            throw e;
        }
    }
}
