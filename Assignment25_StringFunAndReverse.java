package assignments_gtm;

public class Assignment25_StringFunAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "I Love Myself";
		String rev = "";
		System.out.println("The length of the string is:" + name.length());
		System.out.println("The length of the uppercase sentense:" + name.toUpperCase());
		System.out.println("The length of the lowercase sentense:" + name.toLowerCase());
		System.out.println("The length of the string is:" + name.replaceAll(" ", ""));

		for (int i=name.length()-1; i>=0; i--)
		{
			char c1 = name.charAt(i);
			rev = rev+c1;
		}
		System.out.println("Reverse string is:" +rev);
		

	}

}
