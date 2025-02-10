package hierarchical_inheritance;

public class Child2 extends Parent_Class{

	public static void main(String[] args) {
		Child2 obj2 = new Child2();
		obj2.child2method();
		obj2.instance();

	}
	public Child2()
	{
		System.out.println("Seceond child class constructor");
	}
	
	public void child2method()
	{
		System.out.println("Child class instance method");
	}

}
