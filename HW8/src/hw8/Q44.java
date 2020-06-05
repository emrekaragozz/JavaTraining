package hw8;

class DragonException extends Exception {
}

public class Q44 {
    public void openDrawbridge() throws Exception { // r2
        try {
            throw new Exception("This Exception");
        } catch (RuntimeException e) {
            throw new DragonException(); // r2
        } finally { //'finally' block cannot complete normally
            throw new RuntimeException("Or maybe this one");
        }
    }

    public static void main(String[] moat) throws Exception {
        new Q44().openDrawbridge(); // r3 }
    }
}
