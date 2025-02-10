package multilevel_inheritance;

public class FirstChild  extends Parent_class {

	public static void main(String[] args) {
		FirstChild obj = new FirstChild();
		obj.childmultilevel();
		obj.multilevel();

	}
	public void childmultilevel()
	{
		System.out.println("First child class of multilevel");
	}

}
