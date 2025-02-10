package access_specifiers;

public class Main {

	public static void main(String[] args) {
		Main obj = new Main();
		obj.publicmethod();
		obj.privatemethod();
		obj.defaultmethod();
		obj.protectedmethod();
	}
	
	public void publicmethod()
	{
		System.out.println("Public method");
	}
	
	private void privatemethod()
	{
		System.out.println("Private method");
	}
	
	void defaultmethod()    //default method
	{
		System.out.println("Default method");
	}
	
	protected void protectedmethod()
	{
		System.out.println("Protected method");
	}

}
