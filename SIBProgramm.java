package basicprograms;

public class SIBProgramm {
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		new SIBProgramm();
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


