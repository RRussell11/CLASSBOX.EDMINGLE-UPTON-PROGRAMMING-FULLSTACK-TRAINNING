package bookkpj;

//import java.util.HashMap;
import java.util.Map.Entry;

public class Book {

	public String BookTitle;
	public String AuthorName;
	@SuppressWarnings("unused")
	private String Book_Id;
	public String bookDescription;

	public Book(String BookTitle, String bookDescription, String author) {
		// TODO Auto-generated constructor stub
	}

	public String getBookTitle() {
		return BookTitle();
	}

	private String BookTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBookTitle(String bookTitle) {
		bookTitle = BookTitle;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public String getBook_Id() {
		return getBook_Id();
	}

	public void setBook_Id(String Book_Id) {
		this.Book_Id = Book_Id;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	//public String bookDescription;

	//HashMap<String, Integer> book = new HashMap<String, Integer>();
	// book.put("novelVivit", 1);
 
	public void setbook(String nextLine) {
		// TODO Auto-generated method stub
     
	}


	/*public double getMagicValue() {
		// TODO Auto-generated method stub
		return 0;
	}*/

	public void put(int nextBookId, Book book2) {
		// TODO Auto-generated method stub
		
	}

	public static Entry<Integer, Book>[] entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}

