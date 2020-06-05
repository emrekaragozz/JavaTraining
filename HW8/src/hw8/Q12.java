package hw8;

public class Q12 {
    public static void main(String[] dribble) {
        try {
            System.out.print(1); // is executed
            throw new ClassCastException();
        } catch (ArrayIndexOutOfBoundsException ex) { //is skipped
            System.out.print(2);
        } catch (Throwable ex) { //handles the exception
            System.out.print(3);// is executed
        } finally {
            System.out.print(4);// is executed
        }
        System.out.print(5);// is executed
    }
}
