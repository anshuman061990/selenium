package package1;



public class SubString {

	static String test = "welcomtsubzxystrinugafe";
	static int lenth = 1;
	static String output;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] table = new boolean[test.length()][test.length()];
		int k =Integer.valueOf("100");
		k=Integer.parseInt("500");

		System.out.println("integer is "+k);
		for(int i=0;i<test.length();i++) {
			for(int j=0;j<test.length();j++) {
				if(i==j)
					table[i][j] = true;
			}
		}
		
		
		
		for(int i=0;i<test.length();i++) {
			for(int j=i+1;j<test.length();j++) {
				if(table[i][j-1]==true && !test.substring(i,j).contains((test.substring(j,j+1)))) {
					table[i][j]=true;
					if(j-i+1 >lenth) {
						lenth = j-i+1;
					output = test.substring(i, j+1);
					}
				}
				
			}
		}
		System.out.println(output);
		System.out.println("lenth is "+lenth);
		
	}

}
