package package1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("Orange", 1);
		map.put("White", 500);
		map.put("Black", 0);
		map.put("yellow",null);
		map.put("Blue", 50);
		
		for(String m:map.keySet()) {
			System.out.println(m);
		}
		
		for(Integer i:map.values()) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}
}
