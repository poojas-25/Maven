package inheritance_assignment;

public class Salary_Slip extends Calculation {

	public static void main(String[] args) {
		Salary_Slip obj = new Salary_Slip();
		obj.employeedetails();
		obj.salaryslip();

	}
	public void salaryslip()
	{
		double total = basic + hramethod() - pfmethod() - deduction + bonus;
		System.out.println("Basic pay = " + basic);
		System.out.println("HRA = "+ hramethod());
		System.out.println("PF = "+ pfmethod());
		System.out.println("Deduction = "+ deduction);
		System.out.println("Bouns = "+ bonus);
		System.out.println("Total salary = "+ total);
	}

}
