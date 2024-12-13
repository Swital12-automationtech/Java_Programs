package assignments_gtm;

public class Assignment38_AccessSpecifier_methods 
{
	public void first()
	{
		System.out.println("Public method in same class");	
	}
	
	private static void second()
	{
		System.out.println("Private method in same class");	
	}
	
	protected static void third()
	{
		System.out.println("Protected method in same class");	
	}
	
	void forth()
	{
		System.out.println("Default method in same class");	
	}
	public static void main(String[] args) 
	{
		Assignment38_AccessSpecifier_methods a1 = new Assignment38_AccessSpecifier_methods();
		a1.first();
		second();
		third();
		a1.forth();
	}

}
