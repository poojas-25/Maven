package inheritance_assignment;
import java.util.Scanner;

public class Employee_Data {
	double basic;
	double deduction;
	double bonus;
	public void employeedetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basicpay");
		basic = sc.nextDouble();
		
		System.out.println("Enter deduction amount");
		deduction = sc.nextDouble();
		
		System.out.println("Enter bonus");
		bonus = sc.nextDouble();
		}
}
