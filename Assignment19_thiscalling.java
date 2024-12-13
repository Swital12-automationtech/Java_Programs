 package assignments_gtm;

public class Assignment19_thiscalling 
{

	Assignment19_thiscalling(String employee_name,String employee_id)
		{
			this("Google");
			System.out.println("The employee name and employee id are: " + employee_name + "," + employee_id );
		}
	Assignment19_thiscalling(String employee_company)
		{
			this("QA",132000.32);
			System.out.println("The company name is: " + employee_company );

		}
	Assignment19_thiscalling(String designation,double salary)
		{
			System.out.println("Designation and salary are: " + designation + "," + salary);
		}
	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			new Assignment19_thiscalling("Swital Macwan", "A21");

		}

}
