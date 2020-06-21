package hw10;

public class Q53 {
    public static void main(String[] args) {
        short x = 1;
        int y = 4;
        final long winter = 10;
        final byte season = 2;
        int fall = 4;
        final short summer = 3;
        switch (season) {
            case 1:

            //case winter: System.out.print("winter");
                // winter is type of long, it does not allowed in a switch statements.

            //default:
                // duplicate default label

            //case fall:
                System.out.print("fall");
                // fall is compatible but it must be final static
            case summer:
                System.out.print("summer");
            default:
        }
    }
}
