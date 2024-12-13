package assignments_gtm;

import java.util.Arrays;

public class Assignment31_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="listen";
		String s2 ="silent";
		char c1[]= s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
	}

}
