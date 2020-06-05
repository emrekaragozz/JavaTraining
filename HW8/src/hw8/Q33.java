package hw8;

// ClassCastException is thrown
public class Q33 {
    public static void main(String[] args) {
        final Object exception = new Exception();
        final Exception data = (RuntimeException) exception; //cannot be cast to Exception
        System.out.print(data);
    }
}
