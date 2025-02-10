package access_specifiers;

public class NewClass {

	public static void main(String[] args) {
		Main obj = new Main();
		obj.publicmethod();
		//obj.privatemethod();  //cannot access private method
		obj.defaultmethod();
		obj.protectedmethod(); 

	}

}
