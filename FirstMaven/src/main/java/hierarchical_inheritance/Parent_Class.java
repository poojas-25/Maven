package hierarchical_inheritance;

public class Parent_Class {
	
	public void instance()
	{
		System.out.println("Parent class method");
	}
	public void instanceparent()
	{
		System.out.println("Parent class method two");
	}
	public Parent_Class()
	{
		System.out.println("Constructor of parent class"); //constructor will get executed even without calling from the child class
	}

}

