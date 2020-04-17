//Class name must be same with the file name, RollerSkates is changed to Q45. 
public class Q45 {
	static int wheels = 1;
	int tracks = 5;
	public static void main(String[] arguments) {
		Q45 q45 = new Q45();
		int feet = 4, tracks = 15;
		//The code compiles and we get "20" with addition of 4 (feet), 15 (tracks) and 1 (wheels) as the output
		System.out.print(feet + tracks + q45.wheels); 
														
	}
}
