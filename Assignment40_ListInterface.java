package assignments_gtm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment40_ListInterface{

	public static void main(String[] args) 
	{
		List a1 = new ArrayList();
		a1.add("abc");
		a1.add(10);// hetrogeneous data
		a1.add(true);
		System.out.println(a1);
		List a2 = new ArrayList();
		a2.add("software");
		a2.add("software");//duplicate
		a2.add(null);//null
		a2.add(null);
		a2.addAll(a1);
		a2.addLast("data");
		System.out.println("properties of list" + a2);
		
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(10);
		l1.add(null);
		l1.add(null);
		l1.add("abc");
		System.out.println(l1);
		
		PriorityQueue p1 = new PriorityQueue();
		p1.add(10);
		p1.add(10);
		p1.add(34);
		System.out.println(p1);
		Collections.sort(l1);
		System.out.println(l1);

	}

}
