package hw8;

public class Q35 {
    public String getAddress(String street, String city) {
        try {
            return street.toString() + " : " + city.toString();
        } finally {// the finally block always executes
            //all possible outputs must start with "Postes:"
            System.out.print("Posted:");
        }
    }

    public static void main(String[] form) {
        String street = "350 5th"; // value omitted
        String city = "New York"; // value omitted
        System.out.print(new Q35().getAddress(street, city));
    }
}
