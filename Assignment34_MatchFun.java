package assignments_gtm;

public class Assignment34_MatchFun {

	public static void main(String[] args) 
	{
		String a1 = "myJava";
	//i)check if the given string is consists of the exact 6 letters?
		boolean b1 = a1.matches("......");
		if(b1==true)
		{
			System.out.println("The string consists of exact 6 letters");
		}
		else
		{
			System.out.println("The string doesn't consist of 6 letters");
		}
		
	//ii)check if the String starts with 'm' ?
		boolean b2 = a1.matches("m.*");
		if(b2==true)
		{
			System.out.println("The string starts with letter 'm' ");
		}
		else
		{
			System.out.println("The string doesn't starts with letter 'm' ");
		}
		
	//iii)check if the String ends with 'y' ?"
		boolean b3 = a1.matches(".*y");
		if(b3==true)
		{
			System.out.println("The string ends with letter 'y' ");
		}
		else
		{
			System.out.println("The string doesn't ends with letter 'y' ");
		}
		
	}

}
