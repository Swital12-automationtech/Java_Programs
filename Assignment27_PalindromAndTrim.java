package assignments_gtm;

import java.util.Arrays;

public class Assignment27_PalindromAndTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to check if a given string is a palindrome.
		 String dr1= "rotator";
		 String reverse ="";
		 for (int i=dr1.length()-1; i>=0; i--) {
			 char ch = dr1.charAt(i);
			 reverse = reverse+ch;
		 }
		 System.out.println(reverse);
		 if(dr1.equals(reverse))
		 {
			 System.out.println("String is a palindrome");
		 }
		 else
		 {
			 System.out.println("String is not a palindrome");

		 }
	
		 //ii)Check if two strings are equal
		String s1 = "java";
		String s2 = "java";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2))
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");

		}
		                
		//iii)dispaly the trimmed string from the original string ""  A very Good Morning !  """
		String word = "  A very Good Morning !  ";
		System.out.println("The trimmed sentence is :" + word.trim());
	}
}


