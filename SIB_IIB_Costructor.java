package basicprograms;

public class SIB_IIB_Costructor {
	SIB_IIB_Costructor()
	 {
		System.out.println("Constructor");
	 }

	public static void main(String[] args) {
		  
			System.out.println("Main Method");
			new SIB_IIB_Costructor();
		}
			static
			{
				System.out.println("SIB block");
			}
			static
			{
				System.out.println("SIB block 1");
			}
			{
				System.out.println("IIB block");
			}

		

}
