package basicprograms;

/*public class SuperCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package ab48;*/
		class Call
		{
			Call()
			{
				System.out.println("Constructor 2");
			}
		}
		public class SuperCalling extends Call
		{
			SuperCalling()
			{
				//super();//super calling statement
				System.out.println("Constructor 1");
			}
		public static void main(String[] args) 
		{
			
			new SuperCalling();
		}
		

	}


