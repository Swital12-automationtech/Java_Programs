package assignments_gtm;

public class Assignment52_ThrowandThrows {

	public static void main(String[] args) throws NullPointerException,ArithmeticException {
		if(2 <= 0 )
		{
			throw new NullPointerException("Condition is not true");
			
		}
		else
		{
			throw new ArithmeticException("Condition should be correct");
		}
		
	}

}
