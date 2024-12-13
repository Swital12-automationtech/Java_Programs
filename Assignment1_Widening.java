package basicprograms;

public class Assignment1_Widening {

	public static void main(String[] args) {
		//byte to long
		byte a = 127;
		long b = a;
		System.out.println(b);
		
		byte signedByte = -128; // Negative byte
        long signedLong = (long) signedByte;
        System.out.println("Signed Byte to Long: " + signedLong);
        String str = "GroTechMinds";
        System.out.println(str.substring(4, 8));
       
        String str1 = "Java"; 
         String str2 = "Java"; 
         String str3 = new String("Java");System.out.println(str1.equals(str2) && str1.equals(str3));
         String str4 = "Java"; String str5 = "Java"; System.out.println(str4 == str3);  

         } 
	

}
