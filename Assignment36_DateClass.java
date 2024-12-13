package assignments_gtm;

import java.util.Date;

public class Assignment36_DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date d1 = new Date();
     System.out.println(d1.getTime());
     System.out.println("Current Date and Time: " + d1);
     Date d2 = new Date(d1.getTime()+(1000*60*60*24*2));
     System.out.println("Future Date and Time: " + d2);
     Date d3 = new Date(d1.getTime()-(1000*60*60*24*2));
     System.out.println("Past Date and Time: " + d3);

     
	}

}
