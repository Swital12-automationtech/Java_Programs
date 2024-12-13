package assignments_gtm;

import java.util.Scanner;

public class Assignment67_AverageArray {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of array:");
		double a[] = new double[sc.nextInt()];
		System.out.println("Enter the values: ");
		for( int i =0 ; i<a.length; i++)
		{
			a[i] = sc.nextDouble();
			sum = (sum+a[i]);
			//i++;
		}
		double avg = sum/a.length;
		System.out.println(avg);
	}

}
