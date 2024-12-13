package assignments_gtm;
class Parent1
{
	public void one()
	{
		System.out.println("Parent one and non static one method");
	}
	public static void two()
	{
		System.out.println("Parent one and static two method");
	}
}

class Parent2 extends Parent1
{
	public void three() 
	{
		System.out.println("Parent two and non static three method");
	}
	public static void four()
	{
		System.out.println("Parent two and static four method");
	}
	public static void five()
	{
		System.out.println("Parent two and static five method");
	}
}
public class Assignment17_MultilevelInherit extends Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment17_MultilevelInherit a1 = new Assignment17_MultilevelInherit();
		a1.one();
		two();
		a1.three();
		four();
		five();

	}

}
