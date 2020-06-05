package hw8;

//Since it is not an interface RuntimeException cannot be implemented
//RuntimeException is a class
class Problem extends RuntimeException {
}

public class Q46 extends Problem {
    public static void main(String uhOh[]) {
        try {
            throw new Q46();
        } catch (Q46 re) {
            System.out.print("Problem?"); //is printed
        } catch (Problem e) {
            System.out.print("Handled");
        } finally {
            System.out.print("Fixed!"); //is printed
        }
    }
}
