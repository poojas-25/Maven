package newmaven;

public class Customer {

	public static void main(String[] args) {
		Customer obj = new Customer();
		double a[] = {200.50,5000.0};
		System.out.println("The total amount is "+obj.amount(a));
		obj.discount(a);
 
	}
	public double amount(double a[])
	{
		double tot = 0;
		for (int i = 0; i<a.length; i++)
        {
            tot = a[i] + tot;
        }
        return tot;
	}
	public void discount(double d[])
	{
		double dis; 
		if (this.amount(d)>5000)
		{
			dis = (amount(d)*20)/100;
			System.out.println("Total discount is "+dis);
		}
		else
		{
			System.out.println("There is no discount");
		}
			
	}

}
