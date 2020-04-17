public class Q21 { // Class name must be same with the file name, Tolls is changed to Q21. 

	
	private static int yesterday = 1;
	int tomorrow = 10; // is an instance variable
	
	public static void main(String[] args) {
		Q21 tolls = new Q21();
		int today=20, tomorrow = 40; // these are local variables
		System.out.print(today + tolls.tomorrow + tolls.yesterday);
	}
	
}