package hw9;

public class Q27 {

	public static void main(String[] args) {
		String line = new String("-");
	    String anotherLine = line.concat("-"); //returns another object
	    System.out.print(line == anotherLine); //false
	    System.out.print(" ");
	    System.out.print(line.length()); //length of line is 1
	}

}
