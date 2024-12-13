package assignments_gtm;

public class Assignment5_DonatebloodNestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char blood = 'A';
		int age = 21;
		float weight = 65.3f;
		if (age>=18)
		{
			 if(weight>=55)
			 {
				 System.out.println("Person can donate blood");
			 }
			 else {
				 System.out.println("Person cannot donate blood");
			 }
		}
		else
		{
			System.out.println("Person is under age");
		}
	}

}
