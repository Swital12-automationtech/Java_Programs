package assignments_gtm;

import java.util.Arrays;

public class Assignment62_SumArray_ForEach {

	public static void main(String[] args) {
		int sum=0;
		int a1[] = new int[5];
		a1[0] =23;
		a1[1] =42;
		a1[2] =54;
		a1[3] =58;
		a1[4] =88;

		System.out.println(Arrays.toString(a1));
		for(int a2:a1)
		{
				sum = sum + a2;
		}
		System.out.println("The total summation is:" + sum);

	}

}
