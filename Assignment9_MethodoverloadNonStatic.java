package assignments_gtm;

public class Assignment9_MethodoverloadNonStatic {
	public void validlogin() 
	{
		System.out.println("Login successful");
	}
	public void invalidlogin() 
	{
		System.out.println("Login unsuccessful");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assignment9_MethodoverloadNonStatic a1 = new Assignment9_MethodoverloadNonStatic();
		a1.validlogin();
		a1.invalidlogin();
	}

}
