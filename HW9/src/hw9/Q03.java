package hw9;

public class Q03 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder().append("clown");
		StringBuilder sb2 = new StringBuilder("clown");
		StringBuilder sb3 = new StringBuilder("cl").insert(2, "own");

		System.out.println(sb1); // prints "clown"
		System.out.println(sb2); // prints "clown"
		System.out.println(sb3); // prints "clown"

		//all these objects has same value
		System.out.println(sb1.toString().equals(sb2.toString())); //true
		System.out.println(sb2.toString().equals(sb3.toString())); //true
		System.out.println(sb3.toString().equals(sb1.toString())); //true
	}
}
