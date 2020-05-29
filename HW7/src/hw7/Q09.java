package hw7;

class Television {
    protected void watch() {} //cannot be final
}
public class Q09 extends Television {
    protected void watch() { //must have broader access modifier than parent's method
    }
}