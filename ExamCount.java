package basicprograms;

import java.util.Arrays;

public class ExamCount {
	static int countAlpha = 0;
	static int countDigit = 0;

	public static void main(String[] args) {
		String name = "Madam456";
		char[] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i = 0; i<c1.length; i++)
		{
		boolean b1 =	Character.isAlphabetic(c1[i]);
		if(b1 == true)
		{
			countAlpha++;
		}
		boolean b2 = Character.isDigit(c1[i]);
		if(b2 == true)
		{
			countDigit++;
		}
		}
		System.out.println("Alphabets are :" + countAlpha);
		System.out.println("Digits are :"  + countDigit);
	}

}
