package package1;

 abstract class B {
	
	public B() {
		System.out.println("in abstrct");
	}
	public abstract void display();
}

public class Abstract extends B{
	
	public Abstract() {
		System.out.println("in B");
	}
	public void display() {
		System.out.println("within display");
	}
	public static void main(String[] args) {
		
		
		
		Abstract abs = new Abstract();
		abs.display();
	}
}
