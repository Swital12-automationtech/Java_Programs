package assignments_gtm;

import java.util.Date;

public class Assignment37_TimeFormate_daymonthdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime()-(1000*60*60*24*19));
		System.out.println("Time in normal formate:" + d2);
		String s1 = d2.toString();
		System.out.println(s1);
		String s2 = s1.replaceFirst(" ", ",");
		System.out.println(s2);
		System.out.println(s2.substring(0, 11));
		

	}

}
