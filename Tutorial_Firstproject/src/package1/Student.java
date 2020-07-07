package package1;

public class Student {
	
	private int id;
	private int salary;
	private String name;
	private String course;
	
	Student(int id, int salary, String name, String course){
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.course=course;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
