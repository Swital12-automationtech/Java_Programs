package basicprograms;

import assignments_gtm.Assignment38_AccessSpecifier_methods;

public class Assignment38_AccessSpecifier_outsidePackage 
{
	public static void fifth()
	{
		System.out.println("Public access specifier in outside package");
	}
	private static void six()
	{
		System.out.println("Private access specifier in outside package");
	}
	protected void seven()
	{
		System.out.println("Protected access specifier in outside package");
	}
	static void eight()
	{
		System.out.println("Default access specifier in outside package");
	}

	public static void main(String[] args) {
		Assignment38_AccessSpecifier_methods assignment38_AccessSpecifier_methods = new Assignment38_AccessSpecifier_methods();
		// TODO Auto-generated method stub
		assignment38_AccessSpecifier_methods.first();
	}

}
