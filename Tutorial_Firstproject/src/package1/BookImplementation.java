package package1;

import java.util.HashMap;
import java.util.Map;

public class BookImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(1111, "JAVA","IAN","Anshuman");
		Book book2 = new Book(1111, "JAVA","IAN","Anshuman");
		
		HashMap<Integer,Book> map = new HashMap<Integer,Book>();
		map.put(1,book1);
		map.put(2, book2);
		for(Map.Entry<Integer, Book> m :map.entrySet()) {
			
			
			
			
			
			
			Book b=m.getValue();
			System.out.println(m.getKey()+" " +b.getAuthor() + b.getBookid() + b.getBookname()+b.getStudent());
		}
		System.out.println(book1.equals(book2));
	}

}
