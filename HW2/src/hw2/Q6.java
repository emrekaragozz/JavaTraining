package hw2;

public class Q6 {
    // int is primitive type and primitives do not have methods declared on them. this method does not compile
    /*public String convert(int value) {
        return value.toString();
    }*/

    public String convert(Integer value) {
        return value.toString();
    }

    public String convert(Object value) {
        return value.toString();
    }
}
