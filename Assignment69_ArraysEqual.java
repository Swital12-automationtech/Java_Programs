package assignments_gtm;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment69_ArraysEqual {

	public static void main(String[] args) {

		int id[] = new int[4];
		int idno[] = new int[4];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the values of id and idno ");
		for(int i=0; i<=3 ;i++)
		{
			id[i] =s1.nextInt();
			idno[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(id));
		System.out.println(Arrays.toString(idno));
		boolean b1 = Arrays.equals(id,idno);
		if(b1 == true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");

		}	
	}
}


