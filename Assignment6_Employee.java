package assignments_gtm;

public class Assignment6_Employee {

	Assignment6_Employee(String employee_name,String employee_id)
	{
		System.out.println("The employee name and employee id are: " + employee_name + "," + employee_id );
	}
	Assignment6_Employee(String employee_company)
	{
		
		System.out.println("The company name is: " + employee_company );

	}
	Assignment6_Employee(String designation,double salary)
	{
		System.out.println("Designation and salary are: " + designation + "," + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment6_Employee("Swital Macwan", "A21");
		new Assignment6_Employee("Google");
		new Assignment6_Employee("QA", 98000.90);

	}

}
