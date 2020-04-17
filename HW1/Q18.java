public class Q18 {

	public static void main(String[] args) {
		
		
		String tree = "pine";
		int count = 0;
		int height= 0; // is defined here to be accessible from System.out.print method
		
		if (tree.equals("pine")) {
		height = 55;
		count = count + 1; }
		
		System.out.print(height + count);
	}

}

/*
String tree = "pine";
	int count = 0;
	if(tree.equals("pine")){
	int height = 55;	// a local variable cannot be accessed from outside of this scope
	count = count + 1;
}
	System.out.print(height + count);
*/