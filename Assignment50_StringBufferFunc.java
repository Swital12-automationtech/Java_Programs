package assignments_gtm;

public class Assignment50_StringBufferFunc {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello User,");
		   s1.append(" How are you user?. well");
		   System.out.println(s1.insert(12, "Good Morning! "));
		   System.out.println(s1.replace(37, 42, ",doing"));
		   System.out.println(s1.delete(46, 50));
		   System.out.println(s1.charAt(4));
		   System.out.println(s1.capacity());
		   System.out.println(s1.length());
		   System.out.println(s1.substring(3));
		   System.out.println(s1.substring(0, 10));
		   System.out.println(s1.reverse());
		   

	}

}
