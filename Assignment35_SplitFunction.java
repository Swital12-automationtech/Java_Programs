package assignments_gtm;

import java.util.Arrays;

public class Assignment35_SplitFunction {

	public static void main(String[] args) 
	{
	//i)Write a program to split the string ""Java is fun"" into individual words
		String name1 = "Java is fun";
		String s1[] = name1.split(" ");
		System.out.println("The string s1 is: " + Arrays.toString(s1));
	//ii)Split the string ""Java Python C++"" using a comma.
		String name2 = "Java Python C++";
		String s2[] = name2.split(" ");
		System.out.println("The string s2 is: " + Arrays.toString(s2));
	//iii)Split the string ""Java is fun to learn"" into at most 3 parts
		String name3 = "Java is fun to learn";
		String s3[] = name3.splitWithDelimiters(" ", 3);
		System.out.println("The string s3 is: "+ Arrays.toString(s3));
	//iv)Write a program to split a sentence into words, count the words, and print them."
		String s4[] = name3.split(" ");
		System.out.println("The words are :" + Arrays.toString(s4) );
		int totalWords = 0;
		for (String s : s4) {
		    totalWords += s.split(" ").length;
	}
System.out.println("The words are: " + totalWords);
}
}