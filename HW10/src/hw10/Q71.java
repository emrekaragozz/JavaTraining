package hw10;

class OpenDoorException extends Exception {
}

class CableSnapException extends OpenDoorException {
}

public class Q71 {
    public void openDrawbridge() throws Exception {
        try {
            throw new Exception("Problem");
        } catch (OpenDoorException e) {
            throw new OpenDoorException();
        } finally {
            throw new RuntimeException("Unending problem");
        }
    }

    public static void main(String[] moat) throws Exception { //Exception is added
        new Q71().openDrawbridge(); //throws Exception
    }
}