package assignments_gtm;
// ID,Name,College,Branch,phone_no and print the same
import java.util.Scanner;

public class Assignment11_Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of ID");
		int ID = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the value Name");
		String Name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the value College");
		String College = sc.next();
		sc.nextLine();

		System.out.println("Enter the value Branch");
		String Branch = sc.next();
		sc.nextLine();

		System.out.println("Enter the value phone_no");
		long Phone_no = sc.nextLong();
		sc.nextLine();
		
		System.out.println("The name is :" + Name );
		System.out.println("The id is :" + ID );
		System.out.println("The college name is :" + College );
		System.out.println("The branch name is :" + Branch );
		System.out.println("The phone no :" + Phone_no );

	} 

}
