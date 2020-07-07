package package1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDupicates {
	
	
	static String test = "hello how are you what are you doing";
	static char[] array = test.toCharArray();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		char ch = 'a';
		String abc = String.valueOf(ch);
		
		System.out.println(abc);
		System.out.println(test.isEmpty());
		
		
		List<Character> list = new ArrayList<Character>(set);
		
		for(Character i:list) {
			System.out.print(i);
		}
		
		
	}

}
