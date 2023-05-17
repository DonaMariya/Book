package bookstore.books;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Book {
	@Id
	private long id;
	private String title;
	private String author;
	
	@OneToMany
	private List<User> u = new ArrayList<User>();

		public List<User> getU() {
		return u;
	}
	public void setU(List<User> u) {
		this.u = u;
	}
		public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
		
		
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
		}	
}
