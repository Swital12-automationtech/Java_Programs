package assignments_gtm;

class Parentclass
{
	public static void parent() {
		// TODO Auto-generated method stub
		System.out.println("Parent class");
	}
}

public class Assignment16_SingleLevelInheritance extends Parentclass {
	
	public static void child()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent();
		child();
		
	}

}
