package assignments_gtm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment48_ListInterfaceReverseWords {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("irawiT");
		name.add("ramuK");
		name.add("hsinaM");
		System.out.println(name);
		Collections.reverse(name);
		List reversewordsname = new ArrayList();
		for(String reversewords : name)
		{
			reversewordsname.add(new StringBuffer(reversewords).reverse().toString());
			System.out.println(reversewordsname);
		}
		
	}

}
