
public class Ebook extends Book{
	private String format;
	
	Ebook(String title, String author, String format) {
		super(title, author);
		this.format = format;
	}
	
	public String getFormat() {
		return this.format;
	}
}
