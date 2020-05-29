package hw7; //Q01

class Cinema {
    public String name; //made public to be accessible
    public Cinema(String name) {
        this.name = name;
    }
}

public class Q01 extends Cinema {
    public Q01(String movie) {
        super(movie); //inserted with an argument
    }
    public static void main(String[] showing) {
        System.out.print(new Q01("Another Trilogy").name); // prints Another Trilogy
    }
}