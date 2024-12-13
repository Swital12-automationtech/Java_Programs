package assignments_gtm;

import java.util.Arrays;

public class Assignment29_StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kv no2 bangalore";
		String s2 = "karnataka";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2))
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");

		}
	}

}
