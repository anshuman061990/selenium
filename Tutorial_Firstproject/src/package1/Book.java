package package1;

public class Book {
	
	private int bookid;
	private  String bookname;
	private String author;
	private String student;
	
	
	
	public Book(int bookid, String bookname, String author, String student) {
		
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.student = student;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Book.counter = counter;
	}

	static int counter = 0;
	
	@Override
	public boolean equals(Object obj) {
		
		Book obj1 = (Book)obj;
		if(this == obj) {
			return true;
		}
		if(this.getClass()==obj.getClass() && this.bookid==obj1.bookid&&this.student.equals(obj1.getStudent())) {
			return true;
		}
		else
			return false;
	}
	

}
