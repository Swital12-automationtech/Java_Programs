package assignments_gtm;

public class Assignment76_CompilePolymorphism {
	public static int add(int a, int b)
	{
		return a+b;
	}
	public String add(String a, String c)
	{
		return a+c;
	}
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) 
	{
		Assignment76_CompilePolymorphism a1 = new Assignment76_CompilePolymorphism();
		System.out.println("The word is: " + a1.add("Hello" , " World"));
		System.out.println("The sum is: " + add(10,20));
		System.out.println("The count is: " + add(12,34,54));
		

	}

}
