package assignments_gtm;

import java.util.Arrays;

public class Assignment28_ArrayConcept {

	public static void main(String[] args) 
	{
		double price[] = new double[5];
		price[0] = 12.5;
		price[1] = 45;
		price[2] = 75.8;
		price[3] = 125;
		price[4] = 145.50;
		for(int i=0; i<=4; i++)
		{
			System.out.println(price[i]);
		}
		System.out.println("In form of Array:" + Arrays.toString(price));

	
	boolean emailidmatch[] = new boolean[2];
	emailidmatch[0] = true;
	emailidmatch[1] = false;
	
	for(int i=0; i<=1; i++)
	{
		System.out.println(emailidmatch[i]);
	}
	System.out.println("In form of Array:" + Arrays.toString(emailidmatch));

}

}
