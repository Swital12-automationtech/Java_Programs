package assignments_gtm;

public class Assignment32_StringFun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s1 = "Hello";
		   String s2 = "hello";
		   System.out.println("For Equals String:");
		   if (s1.equals(s2))
		   {
			   System.out.println("They are equals");
		   }
		   else
		   {
			   System.out.println("They are not equals");
		   }
		   ////////////////////////////////////////////////
		   System.out.println("For EqualsIgnore String:");

		   if (s1.equalsIgnoreCase(s2))
		   {
			   System.out.println("Strings are equals");
		   }
		   else
		   {
			   System.out.println("Strings are not equals");
		   }
		  /////////////////////////////////////////////////// 
		   System.out.println("For Contains String:");
		   String sentence = "Getting hands-on with Java is fun.";
		   boolean a1 = sentence.contains("Java");
		   if (a1==true)
		   {
			   System.out.println("String contains java in it");
		   }
		   else
		   {
			   System.out.println("String contains python in it");
		   }
	}

}
