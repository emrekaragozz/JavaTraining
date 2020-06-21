package hw10;

abstract class Bear {
    protected int sing;

    protected abstract int grunt();

    int sing() {
        return sing;
    }
}

public class Q79 extends Bear {
    protected int grunt() {
        int sing= 0 ;
        sing += 10;
        return 10;
    }
}
