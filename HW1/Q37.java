// Class name must be same with the file name, Magnet is changed to Q28. 
// line a1 is at outside of the class, we cannot declare a variable here
public class Q37 {
	public String color; // line a2, instance variable "public String color" can be declared here
	public void attach() {
		String color; // line a1, local variables cannot have access modifiers, that is why I remove the public keyword
	}
	//public String color; line a4, instance variable "public String color" can be declared here
}
