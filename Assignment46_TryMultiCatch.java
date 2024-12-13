package assignments_gtm;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment46_TryMultiCatch {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int id[] = new int[sc.nextInt()];
	        System.out.println("Enter the data");
	        for(int i = 0; i<id.length; i++)
	        {
	        	id[i] =sc.nextInt();
	        }
			System.out.println(Arrays.toString(id));
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Correct value should be entered in integer digit and in correct size");
		}
		catch(NegativeArraySizeException n1)
		{
			System.out.println("Value should be positive");
		}
	}

}
