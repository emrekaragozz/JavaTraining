package hw9;

public class Q04 {

	public static void main(String[] args) {
		StringBuilder teams = new StringBuilder("333");
		
		/*append method adds the parameter to the StringBuilder 
		  and returns a reference to the current StringBuilder.*/ 
		teams.append(" 806");
		teams.append(" 1601");
		System.out.print(teams); //prints 333 806 1601
	}

}
