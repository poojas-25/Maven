package multilevel_inheritance;

public class SecondChild extends FirstChild {

	public static void main(String[] args) {
		SecondChild obj = new SecondChild();
		obj.secondmultilevel();
		obj.childmultilevel();
		obj.multilevel();
		
	}
	public void secondmultilevel()
	{
		System.out.println("Second child class of multilevel");
	}

}
