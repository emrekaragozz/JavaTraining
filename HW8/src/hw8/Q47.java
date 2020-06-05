package hw8;

interface Source {
    void flipSwitch() throws Exception;
}

//throws keyword cannot be used in order to throw an exception
//throw keyword must be used in order to throw an exception
public class Q47 implements Source {
    public void flipSwitch() {
        try {
            throw new RuntimeException("Circuit Break!");
        } finally {
            System.out.print("Flipped!");
        }
    }
    public static void main(String... electricity) throws Throwable {
        final Source bulb = new Q47();
        bulb.flipSwitch();
    }
}