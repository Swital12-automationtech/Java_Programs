package basicprograms;

import assignments_gtm.Assignment38_AccessSpecifier_methods;

public class Assignment38_AccessSpecifier_insidePackage extends Assignment38_AccessSpecifier_methods
{
	public static void nine()
	{
		System.out.println("Public access specifier in outside package");
	}
	private static void ten()
	{
		System.out.println("Private access specifier in outside package");
	}
	protected void elevan()
	{
		System.out.println("Protected access specifier in outside package");
	}
	static void twelve()
	{
		System.out.println("Default access specifier in outside package");
	}
	
	public static void main(String[] args) {
		Assignment38_AccessSpecifier_methods a1 = new Assignment38_AccessSpecifier_methods();
		a1.first();
		a1.third();

	}

}
