package hw7;

interface MusicCreator { public Number play(); }

abstract class StringInstrument {
    public Long play() {return 3L;}
}

public class Q48 extends StringInstrument implements MusicCreator {
    public Long play() {
        return 12l; //cannot be an int
    }
}