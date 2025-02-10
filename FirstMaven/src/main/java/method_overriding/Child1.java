package method_overriding;

public class Child1 extends Parent_Class {

	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.instance();           //overrides the method from parent class and executes the same method in child class
        obj.newmethod("overriding");
        
	}
	public void instance ()      //method overriding - non parameterized method
	{
		super.instance();
		System.out.println("Method of child class");
	}
	public void newmethod(String a) //method overriding with same parameter list
	{
		super.newmethod("Parent class");  //super keyword to access the immediate parent class method
		System.out.println(a);
	}
}
