package hw10;

public class Q12 {
    public static void main(String[] args) {
        long bignum = 1234; //valid
        //long bignum2 = 1234.0; //a “long” variable cannot contain a decimal point.
        //long bignum3 = 1234.0L; //a “long” variable cannot contain a decimal point.
        long bignum4 = 1234l; //valid
        long bignum5 = 1234L; //valid
        long bignum6 = 1_234; //valid
    }
}
