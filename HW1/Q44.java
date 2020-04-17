//Class name must be same with the file name, Keyboard is changed to Q44. 
public class Q44 {
	private boolean numLock = true;
	static boolean capLock = false;
	
	public static void main(String... shortcuts) {
		Q44 q44 = new Q44(); // this object created to access private variable numLock
		System.out.print(q44.numLock+" "+capLock); 
		}
}

/*
public class Keyboard {
	private boolean numLock = true;
	static boolean capLock = false;
	public static void main(String... shortcuts) {
		System.out.print(numLock+" "+capLock); 
	}
}
*/