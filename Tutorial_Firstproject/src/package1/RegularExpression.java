package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String line = "anshu4star@akjfkaj.com";
		String pattern = "[\\w]+((@gmail\\.com)|(@infosys\\.com))";
	//	String pattern = "\\d{10}";
		long mobile=8699056783l;
		String mob = String.valueOf(mobile);
		Pattern pat = Pattern.compile(pattern);
		Matcher m = pat.matcher(line);
		System.out.println(m.matches());
		
	
		
	}

}
