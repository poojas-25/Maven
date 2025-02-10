package access_specifiersNew;

import access_specifiers.Main;

public class Check_Access extends Main {

	public static void main(String[] args) {
		Check_Access obj = new Check_Access();
		obj.protectedmethod();           //can access protected method
		obj.publicmethod();             //can access public method
	}

}
