package assignments_gtm;

public class Assignment12_Variables {
	static int a =100; //global variable
	static int b = 130;//global variable
	static final double pi =3.14;//final variable
	static double r = 9;//global variable
	static void addition()
	{
		int add = a+b;
		System.out.println("The addition value : " + add);
	}
	
	void substraction()
	{
		int a = 190;//local variable
		int b = 200;//local variable
		int sub = b-a;
		System.out.println("The substraction value : " + sub);
	}
	static void area() 
	{
		double area1 = pi*r*r;
		System.out.println(area1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		Assignment12_Variables a1 = new Assignment12_Variables();
		a1.substraction();
		area();
	}
		
}
