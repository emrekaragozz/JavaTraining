package hw8;

class CastleUnderSiegeException extends Exception {
}

class KnightAttackingException extends CastleUnderSiegeException {
}

// checked exceptions must be declared or handled
public class Q22 {
    public void openDrawbridge() { // q1 declaration is inserted
        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            try {
                throw new CastleUnderSiegeException();
            } catch (CastleUnderSiegeException e1) {

            } // q2
        } finally {
            try {
                throw new CastleUnderSiegeException();
            } catch (CastleUnderSiegeException e) {

            } // q2
        }
    }

    public static void main(String[] moat) {
        new Q22().openDrawbridge(); // q3
    }
}