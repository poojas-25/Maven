package polymorphism;
import java.util.Scanner;
public class Offseason extends Onseason {
	
	public static void main(String[] args) {
		Offseason obj = new Offseason();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter season");
		String a = sc.next();
		System.out.println("Enter amount");
		double b = sc.nextDouble();
		obj.finddiscoutnt(a,b);
	}
	
	public void discount(double amount)
	{
		    double disc = amount * 0.15f;
			System.out.println("Discount amount is "+ disc);
	}
	
	public void finddiscoutnt(String season, double amt)
	{
		if (season .equals("Offseason"))
		{
			discount(amt);
		}
		else if (season .equals("Onseason"))
			{
				super.discount(amt);
			 
			}
	}

}
