package assignments_gtm;

public class Assignment2_CallStaticNonstaticMethod {
	
	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Substraction");
	}
	static void div()
	{
		System.out.println("Division");
	}

	void mul()
	{
		System.out.println("Multiplication");
	}
	void modulo()
	{
		System.out.println("Modulo");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		div();
		Assignment2_CallStaticNonstaticMethod m1 = new Assignment2_CallStaticNonstaticMethod();
		m1.mul();
		m1.modulo();
	}

}
