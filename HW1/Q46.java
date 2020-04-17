//Class name must be same with the file name, Bicycle is changed to Q46. 
public class Q46 {
	String color = "red";
	private void printColor(String color) {
		color ="purple";
		System.out.print(color);
	}
	public static void main(String[] rider) {
		/*The value of color passed to the “printColor()” method has no
		importance here. “printColor()” method always prints purple as output.*/
		new Q46().printColor("blue");
	}
}
