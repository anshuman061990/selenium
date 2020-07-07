package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArryayList {

	static String one = "Red";
	static String two = "white";
	static String three = "yellow";
	static String four = "orange";
	
	public static void main(String[] args) {
		
	LinkedList<String> list = new LinkedList<String>();
		
		list.add(one);
		list.add(two);
		list.add(three);
		
		list.add(0, "purple");		
	list.add("black");
	list.addFirst("blue");
	
	System.out.println(list);
	Iterator itr = list.iterator();
	
	

	String[] array = new String[list.size()];
	list.toArray(array);
	
	for(String s:array) {
		System.out.println(s);
	}
	
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	
//	
	
}
}

