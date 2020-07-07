package package1;

public class Reversenumber {

 static	int num =1005;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc = String.valueOf(num);
		
		StringBuilder sb = new StringBuilder(abc);
		abc = sb.reverse().toString();
		int result = Integer.valueOf(abc);
		
		System.out.println(result);
	}

}
