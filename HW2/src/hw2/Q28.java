package hw2;

public class Q28 {
    public static void main(String[] args) {
        Integer integer = new Integer(4);
        System.out.print(integer.byteValue());
        System.out.print("-");
        int i = new Integer(4);
        //System.out.print(i.byteValue()); we cannot call a method on primitive
        System.out.print(i);
    }
}
