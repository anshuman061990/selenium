package packageA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//***** to be implemented
public class UserInterface {
	public static Map<Integer, String> category = new HashMap<Integer, String>();
	public static List<Trainers> trainers = new ArrayList<Trainers>();
	public static List<Register> traineeslist=new ArrayList<Register>();
	public static void main(String[] args) throws Exception {
		Utils.categorypopulate();
		Utils.trainerpopulate();
		
		System.out.println("1- Beginners"+"\n"+"2- Half Marathon Running"+"\n"+"3- Full Marathon Running"+"\n"+"4- Ultra Run"+"\n"+"Enter your choice");
		Scanner sc = new Scanner(System.in);
		String category;
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter you empoloyee id");
		int id = sc.nextInt();
		sc.nextLine();
		switch(number) {
		case 1:
			category="Beginners";
			break;
		case 2:
			category="Half Marathon Running";
			break;
		case 3:
			category = "Full Marathon Running";
			break;
		case 4:
			category = "Ultra Run";
			break;
		default:
			category=null;
		}
		System.out.println("Your choice is "+category +"\n"+"Type Yes to register");
		String confirm = sc.nextLine();
		while(!(confirm.equalsIgnoreCase("no") || confirm.equalsIgnoreCase("yes"))) {
			System.out.println("you have entered an invalid choice. Please select either yes or no");
			confirm = sc.nextLine();
		}
		
		if(confirm.equalsIgnoreCase("no")) {
			System.out.println("Registration couldnt be completed");
			sc.close();
			System.exit(0);
		}
		else if(confirm.equalsIgnoreCase("yes")) {
			
			try {
			
			Register register = new Register();
			register.setCategory(category);
			register.setId(id);
			register.setName(name);
			RegisterService rs = new RegisterService();
			rs.checkAvailability(register);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				sc.close();
			}
		}
			
	}
}
