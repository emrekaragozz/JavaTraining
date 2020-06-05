package hw8;

class OutOfBoundsException extends BadCatchException {
}

class BadCatchException extends Exception {
}

public interface Q42 {
    public void catchBall() throws OutOfBoundsException;
}

class Answer implements Q42 {
    //public int catchBall() throws OutOfBoundsException;
    //public int catchBall() throws BadCatchException;
    //public int catchBall() throws Exception;
    public void catchBall() throws OutOfBoundsException {
        System.out.println("Return type must be covariant with void ");
    }
}