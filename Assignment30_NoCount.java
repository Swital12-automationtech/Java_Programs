package assignments_gtm;

import java.util.Arrays;

public class Assignment30_NoCount {
    static int countAlpha=0;
    static int countDigit=0;
    static int countSpace=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " Hello! 123@ jAvA_";
		char a1[] = name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for (int i=0; i<a1.length; i++)
		{
		   boolean b1 = Character.isAlphabetic(a1[i]);
		           if(b1==true)
		           {
		           countAlpha++;
		           }
		}
		for(int i=0; i<a1.length;i++)
		{
		   boolean b2 = Character.isDigit(a1[i]);
		 
			   if(b2==true)
			   {
				   countDigit++;
			   }
		 }
		for(int i=0; i<a1.length;i++)
		{
			boolean b3 = Character.isSpaceChar(a1[i]);
			if(b3==true)
			{
				countSpace++;
			}
		}
	
		System.out.println(countAlpha);
		System.out.println(countDigit);
		System.out.println(countSpace);
        int CountSpecialCharacter=0;
        CountSpecialCharacter = (name.length()-(countAlpha+countDigit+countSpace));
        System.out.println(CountSpecialCharacter);
}
}
