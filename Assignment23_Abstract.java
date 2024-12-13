package assignments_gtm;
abstract class Studentclass
{
	abstract void s1();
	abstract void s2();
	
	static void s3()
	{
	System.out.println("This is concrete method one");
	}
	void s4()
	{
	System.out.println("This is concrete method two which is non static");
	}
   
}  
public class Assignment23_Abstract extends Studentclass {
	void s1() {
		// TODO Auto-generated method stub
     System.out.println("This is abstract method s1");
	}

	void s2() {
		// TODO Auto-generated method stub
         System.out.println("This is abstract method s2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s3();
		Assignment23_Abstract c1 = new Assignment23_Abstract();
		c1.s4();
		c1.s1();
		c1.s2();
	}

	

}


