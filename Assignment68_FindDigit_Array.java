package assignments_gtm;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment68_FindDigit_Array 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int a[] = new int[s1.nextInt()];
		System.out.println("Enter the values: ");
		int number = 34;
		for( int i = 0 ; i<=a.length ; i++)
		{
			a[i] = s1.nextInt();
			if (number == a[i])
			{
				System.out.println("The number is in the array");
				System.out.println("The index is " +i);

			}
			
			
		}
		

	}

}
