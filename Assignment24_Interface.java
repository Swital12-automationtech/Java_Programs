package assignments_gtm;
interface Register
{
	void member();
	
}
interface Faculty
{
	void staff();

}
public class Assignment24_Interface implements Register, Faculty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment24_Interface a1 = new Assignment24_Interface();
		a1.staff();
		a1.member();
	}

	@Override
	public void member() {
		// TODO Auto-generated method stub
		System.out.println("All registered student");
	}

	@Override
	public void staff() {
		// TODO Auto-generated method stub
		System.out.println("All faculty");
	}

}

