package assignments_gtm;

public class Assignment43_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hello, World!");
		sb1.append("How are you?");
		System.out.println("Insert string :" + sb1.insert(6, "Java"));
		System.out.println("Delete char :" + sb1.delete(2, 5));
		System.out.println("Reverse string:" + sb1.reverse());

	}

}
