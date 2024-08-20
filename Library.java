package interfaceLibrary;

public interface Library {
	// addBook(Book book), searchByTitle(String title), searchByAuthor(String
	// author), and displayBooks().

	String addBook();

	String searchTitle();

	String displayBooks();

}

class LibraryImpl implements Library {
	private String book;
	private String title;
	private String displaybooks;
	
	

	public LibraryImpl(String book, String title, String displaybooks) {
		super();
		this.book = book;
		this.title = title;
		this.displaybooks = displaybooks;
	}

	

	@Override
	public String addBook() {
		return book;
	}

	@Override
	public String searchTitle() {
		return title;
	}

	@Override
	public String displayBooks() {
		
		return displaybooks;
	}
   class LibMain{
	public static void main(String[] args) {
		Library library = new LibraryImpl("NorthWoods", "novel, ", "book");
		library.addBook();
		library.searchTitle();
		library.displayBooks();
	}
   }
   }


