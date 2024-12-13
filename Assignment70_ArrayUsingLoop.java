package assignments_gtm;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment70_ArrayUsingLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int b[] = new int[sc.nextInt()];
		System.out.println("Enter the values");
		// using for loop
		
		System.out.println("Using for loop: ");

		for(int i = 0; i<b.length ; i++)
		{
			b[i] = sc.nextInt();
			System.out.println(b[i]+ " ");
		}
		
		System.out.println("For each loop: ");

		//using for each loop
		for (int c: b)
		{
			System.out.println(c + " ");
		}
		//using sysout 
		System.out.println("Using Sysout: ");
		for(int i=0 ; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		//using System out print statement with array function
		System.out.println("Using array function: ");
		System.out.println(Arrays.toString(b));
	}

}
