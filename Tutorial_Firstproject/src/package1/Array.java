package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
	
		int[] array = {5,80,2,47,654,58};
		
		String[] abc = {"Anshma","fkjkajf","this is new"};
		for(int i:array) {
			System.out.print(i+" ");
		}		
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(abc));

	}

}
