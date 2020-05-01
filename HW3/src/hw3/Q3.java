package hw3; // registration is changed to hw3

// Class name must be same with the file name, NameCheck is changed to Q3.
public class Q3 {
        public static void main(String... data) {
            String john = "john";
            String jon = new String(john);

            System.out.println(jon); //prints john
            System.out.println(john); //prints john

            System.out.print((john==jon)+" "+(john.equals(jon)));
        }
}
