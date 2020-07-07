package package1;

import java.util.HashMap;
import java.util.Map;

public class Main {
	

static String abc = "successes";

static char[] array = abc.toCharArray();
	public static void main(String[] args) {		
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
	
		for(int i=0;i<array.length;i++) {
			
			if(m.containsKey(array[i])) {
			
				m.put(array[i], m.get(array[i])+1);
			}
				else
			m.put(array[i], 1);		
				
				}
		
   for(Map.Entry<Character, Integer> map:m.entrySet() ) {
	   System.out.println(map.getKey() + " "+ map.getValue());
   }
		}
		
	}
