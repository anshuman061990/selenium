package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		
		try
		{	
			FileInputStream fis = new FileInputStream("c']kkaofk");
			System.out.println("try");
			int i =fis.read();
		
		}
		
		
		
		catch(IOException e) {
			
			e.printStackTrace();
			System.out.println("anshuman");
		}
		finally{
			System.out.println("finally");}
		}

}
