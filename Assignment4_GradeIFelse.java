package assignments_gtm;

public class Assignment4_GradeIFelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 90;
		if(marks <100 && marks >=90)
			{
			System.out.println("Grade A+");
			}
		else if(marks <90 && marks >=80)
			{
			System.out.println("Grade A");
			}
		else if(marks <80 && marks >=70)
			{
			System.out.println("Grade B");
			}
		else if(marks <70 && marks >=60)
			{
			System.out.println("Grade C");
			}
		else if(marks <60 && marks >=50)
			{
				System.out.println("Grade D");
			}
		else 
			{
			System.out.println("Fail");
			}
	}

}
