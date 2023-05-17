package bookstore.books;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
   
    {
    	
    	
    	Book b = new Book();
    	b.setId(1);
    	b.setTitle("abc");
    	b.setAuthor("xyz");
    	User u = new User();
    	u.setId(007);
    	u.setName("James");
//    	u.setBook(b);
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(User.class);
    	 SessionFactory factory = config.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	
    List<User> u1 = new ArrayList<User>();
    User u2 = new User();
	u2.setId(8);
	u2.setName("Bond");
	u1.add(u2);
	session.save(u2);
	 User u3 = new User();
		u3.setId(9);
		u3.setName("Bond");
		User.add(u3);
		session.save(u3);
    	session.save(u2);
    	session.save(b);
    	tx.commit();
    	System.out.println(u1);
		
    	
//        System.out.println( "Hello World!" );
    }
}
