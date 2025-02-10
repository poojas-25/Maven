package superkeyword;

public class Child extends Parent {

	int a =7;
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.instance();

	}
	public void instance()
	{
		super.instanceparent();  //calls the method of parent class
		System.out.println("Method of child class");
		System.out.println("Instance variable of parent class = " +super.a); //calls instance variable of parent class
		System.out.println("Instance variable of child class = " +a);
		
	}
	public Child()
	{
		super();
		System.out.println("Constructor of child class");
	}

}
