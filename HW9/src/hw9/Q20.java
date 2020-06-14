package hw9;

public class Q20 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("radical ");

        sb = new StringBuilder("radical ")
                .append("robots");
        System.out.println(sb); //radical robots

        StringBuilder sb2 = new StringBuilder("radical ");
        sb2 = new StringBuilder("radical ")
                .delete(1, 100)
                .append("obots")
                .insert(1, "adical r");
        System.out.println(sb2); //radical robots

        StringBuilder sb3 = new StringBuilder("radical ");
        sb3 = new StringBuilder("radical ")
                .insert(7, "robots");
        System.out.println(sb3); //radicalrobots

        StringBuilder sb4 = new StringBuilder("radical ");
        sb4 = new StringBuilder("radical ")
                .insert(sb4.length(), "robots");
        System.out.println(sb4); //radical robots


    }
}
