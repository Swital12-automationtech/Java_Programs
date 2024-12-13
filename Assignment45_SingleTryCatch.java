package assignments_gtm;

import java.util.Arrays;

public class Assignment45_SingleTryCatch {
	

	public static void main(String[] args) {
		try {
			int a[] = new int[2];
		    a[0]= 10;
		    a[1]= 11;
		    a[3]= 12;
			System.out.println(Arrays.toString(a));
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println("Enter the digit which are equal to limited to array size");

		}
		

	}

}
