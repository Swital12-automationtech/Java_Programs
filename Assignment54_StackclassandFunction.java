package assignments_gtm;

import java.util.Stack;

public class Assignment54_StackclassandFunction {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push("simon");
		s1.push("joshua");
		s1.push("jim");
		s1.push("benedict");
		s1.push("Mary");
		System.out.println("Output after adding element:" + s1);
		System.out.println(s1.pop());
		System.out.println("Output after removing element:" + s1);
		System.out.println(s1.peek());
		System.out.println("Output after fetching last element:" +s1);


	}

}
