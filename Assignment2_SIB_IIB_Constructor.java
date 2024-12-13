package basicprograms;

public class Assignment2_SIB_IIB_Constructor 
{
	Assignment2_SIB_IIB_Constructor()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Assignment2_SIB_IIB_Constructor a11 = new Assignment2_SIB_IIB_Constructor();
		Assignment2_SIB_IIB_Constructor a12 = new Assignment2_SIB_IIB_Constructor();

	}

	static
	{
		System.out.println("One SIB");
	}
	{
		System.out.println("1st IIB");
	}
	{
		System.out.println("2nd IIB");
	}
}
