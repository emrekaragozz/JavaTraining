package hw7;

interface Horn {  public Short play(); }
abstract class Woodwind { public Short play() { return 3;}}
public final class Q19 extends Woodwind implements Horn {
    public Short play() {
        return null;
    }
}