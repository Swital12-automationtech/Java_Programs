package assignments_gtm;

import java.util.Scanner;

public class Assignment65_AccessSpecifier_Class 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //public class
		System.out.println("Enter the value: ");
		System.out.println("The entered value is: " + sc.nextInt());
		Parentclass p1 = new Parentclass(); // default class created in same package and another class
			p1.parent();
			//System.out.println(p1);
		}
	}

