import dog.*;
import dog.puppy.*;
public class Q41 {
	dog.puppy.female.KC kc = new dog.puppy.female.KC(); 
	//KC kc = new KC(); // we cannot access this because this subpackage is not imported
	Georgette george = new Georgette();
	Webby webby = new Webby();
	Object object = new Object();	
}
