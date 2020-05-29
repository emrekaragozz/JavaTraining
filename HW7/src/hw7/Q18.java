package hw7;

abstract class Triangle {
    abstract String getDescription();
}

class RightTriangle extends Triangle {
    protected String getDescription() { return "rt"; } // g1
}
public class Q18 extends RightTriangle {  //If Q18' is abstract, it cannot be instantiated
    public String getDescription() { return "irt";
    }
    public static void main(String[] edges) {
        final Triangle shape = new Q18(); //causes an error
        System.out.print(shape.getDescription()); }
}