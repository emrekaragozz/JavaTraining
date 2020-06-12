package hw9;

public class Q46 {
    public static void main(String[] args) {
        String a= "Advent";
        String g= "Genesis";

        StringBuilder r = new StringBuilder("GEN");

        String a2=a.replace('t','T'); // char, char parameters
        String g2=g.replace("Gen",r); // String, StringBuilder parameters

        System.out.println(a2);
        System.out.println(g2);
    }
}
