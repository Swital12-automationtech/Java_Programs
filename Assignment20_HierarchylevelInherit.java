package assignments_gtm;
class Ten
{
	static void addition()
	{
		System.out.println("Addition method");
	}
}
class Elevan extends Ten
{
	void substraction()
	{
		System.out.println("Substraction method");
	}
}
public class Assignment20_HierarchylevelInherit extends Ten {
	static void Finalvalue()
	{
		System.out.println("addition and substraction methods inherit form parent1 and parent2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		Finalvalue();
		Elevan t1 = new Elevan();
		t1.substraction();
	}

}
