package single_inheritance;

public class Child extends Parent {
	
	public static void main(String[] args)
	{
		Child c =new Child();
		c.name();
		c.inheritance();
	}
	
	public void inheritance()
	{
		System.out.println("Method of child class");
	}

}
