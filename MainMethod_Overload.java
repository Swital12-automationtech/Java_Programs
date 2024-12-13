package basicprograms;

public class MainMethod_Overload {

	public static void main(String[] args) 
	{
		main();
		main(3,5);
		main(3.53, 6.2);
	}
	public static void main() 
	{
		System.out.println("without parameter");
	}
	public static void main(int a, int b) 
	{
		System.out.println("with int parameter");
	}
	public static void main(double c, double d) 
	{
		System.out.println("with double parameter");
	}
}
