package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter file = new FileWriter("C:\\Users\\LEBU\\Downloads\\test.txt", true);
		file.write("\n");
		String test = "welcome here";
		file.write(test+"\n");
		file.close();
	FileOutputStream fos = new FileOutputStream("C:\\Users\\LEBU\\Downloads\\test.txt", true);
	
	byte[] array = test.getBytes();
	
	fos.write(array);
	
	fos.close();

	
	FileInputStream fis1 = new FileInputStream("C:\\Users\\LEBU\\Downloads\\test.txt");
	int j=0;

	
//	while((j=fis1.read())!=-1) {
//		
//		System.out.print((char)j);
//		
//	}
//	fis1.close();
	
	FileReader fil = new FileReader("C:\\\\Users\\\\LEBU\\\\Downloads\\\\test.txt");
	BufferedReader read = new BufferedReader(fil);
	String may=read.readLine();
	
	while( may!=null) {
	System.out.println(may);
	may=read.readLine();
	}
	read.close();
	fil.close();

	
}

}
