package method_overriding;

public class Parent_Class {

	public void instance ()  //method overriding - non parameterized method
	{
		System.out.println("Method of parent class");
	}
	public void newmethod(String a) //overriding parameterized method 
	{
		System.out.println(a);
	}
}
