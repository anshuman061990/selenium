package packageA;

public class Utils {
	
//***********implemented***

	public static void categorypopulate() {
		UserInterface.category.put(1, "Beginners");
		UserInterface.category.put(2, "Half Run Marathon");
		UserInterface.category.put(3, "Full run Marathon");
		UserInterface.category.put(4, "Ultra Run");
	}
	
	public static void trainerpopulate() {
		Trainers t1=new Trainers();
		t1.setCategory("Beginners");
		t1.setCountoftrainees(6);
		t1.setName("David");
		Trainers t2=new Trainers();
		t2.setCategory("Half Marathon Running");
		t2.setCountoftrainees(5);
		t2.setName("John");
		
		
		Trainers t3=new Trainers();
		t3.setCategory("Full Marathon Running");
		t3.setCountoftrainees(4);
		t3.setName("Elvis");
		Trainers t4 = new Trainers();
		t4.setCategory("Half Marathon Running");
		t4.setCountoftrainees(8);
		t4.setName("Nick");
		Trainers t5 = new Trainers();
		t5.setCategory("Ultra Run");
		t5.setCountoftrainees(10);
		t5.setName("Alisha");
		
		UserInterface.trainers.add(t1);
		UserInterface.trainers.add(t2);
		UserInterface.trainers.add(t3);
		UserInterface.trainers.add(t4);
		UserInterface.trainers.add(t5);
		
	}
}
