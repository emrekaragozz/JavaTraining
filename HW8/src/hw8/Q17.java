package hw8;

class CapsizedException extends Exception {
}

class Transport {
    public int travel() throws CapsizedException {
        return 2;
    }

    ;
}

public class Q17 {
    public int travel() throws Exception {
        return 4;
    }


    public static void main(String... distance) throws Exception {
        try {
            System.out.print(new Q17().travel());
        } catch (Exception e) { //catch block must be used with brackets
            System.out.print(8);
        }
    }
}
