package bookstore.books;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class User {
	
//	@OneToOne
//	private Book b;
	
	@Id
	private int Id;
	private String name;
	
	public int getId() {
		return Id;
	}
	public void setId(int i) {
		Id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + "]";
	}
//	public void setBook(Book b) {
//		this.b = b;
//		// TODO Auto-generated method stub
//		
//	}
	public static void add(User u2) {
		// TODO Auto-generated method stub
		
	}
	
	}

