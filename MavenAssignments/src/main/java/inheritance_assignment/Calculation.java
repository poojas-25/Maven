package inheritance_assignment;

public class Calculation extends Employee_Data {

	public double hramethod()
	{
		double hra = basic * 0.5;
		return hra;
		
	}
	
	public double pfmethod()
	{
		double pf = basic * 0.2;
		return pf;
	}

}
