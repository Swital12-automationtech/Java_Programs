package assignments_gtm;

public class Assignment72_FinallyBlock {

	public static void main(String[] args) {
		try
		{
			int a = 2+2;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Catch block execute");
		}
		finally
		{
			System.out.println("Finally get always execute");
		}

	}

}
