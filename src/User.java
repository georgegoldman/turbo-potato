import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
	private String name;
	private LocalDate birthday;
	public ArrayList<Book> books = new ArrayList<Book>();
	
	User(String name, String birthday) {
		this.name = name;
		this.birthday = LocalDate.parse(birthday);
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getBirthday() {
		return this.birthday.toString();
	}
	
	public void borrow(Book book) {
		this.books.add(book);
	}
	
	public int age() {
		int age = Period.between(this.birthday, LocalDate.now()).getYears();
		
		return age;
	}
}
