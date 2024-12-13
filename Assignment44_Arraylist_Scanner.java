package assignments_gtm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment44_Arraylist_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a1[] = new int[sc.nextInt()];
		System.out.println("Enter the values in array");
		for(int i = 0 ; i<a1.length; i++)
		{
			a1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a1));
	}

}
