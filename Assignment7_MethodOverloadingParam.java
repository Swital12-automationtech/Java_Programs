package assignments_gtm;

public class Assignment7_MethodOverloadingParam {
	
	public static void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void addition(double a, double b)
	{
		System.out.println(a+b);
	}
	public static void addition(String a, String b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(10,20);
		addition(13.44, 143.37);
		addition("Swital", "Macwan");
	}

}
