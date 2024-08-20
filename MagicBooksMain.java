package mbookspckg;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import  bookkpj.Book;
import studpkg.User;


public class MagicBooksMain {
    private HashMap<Integer, Book> books;
    private int nextBook_Id;
    private  Scanner scanner;
    public MagicBooksMain() {
        this.books = new HashMap<>();
        scanner = new Scanner(System.in);
        this.nextBook_Id = 1;
    }
 
    public void validateUser() {
            System.out.println("Welcome to MagicOfBooks Library!");
            System.out.println("------------------------------\n###########"	);
			System.out.println("Enter number of Users: ");
			int userId = scanner.nextInt();
			User[] userArr = new User[userId];
			for (int x = 0; x < userId; x++) {
			    User usr = new User();
			    System.out.println("Enter UserId: ");
			    usr.setuserId(scanner.nextInt());
			    System.out.println("Enter UserName, And:"  );
			    usr.setUserName(scanner.nextLine());
			    System.out.println("The EmailId: ");
			    usr.setemailId(scanner.nextLine());
			    System.out.println("Verifing id: ");
			    System.out.print("Enter password: ");
			    usr.setpassword(scanner.nextLine());
			    System.out.println("Enter new Books or typebook_Collections: ");
			    usr.setNewBooks(scanner.nextLine());
			    System.out.println("Type Favourite Book: ");
			    usr.setfavouriteBook(scanner.nextLine());
			    System.out.println("Enter Completed Book: ");
			    usr.setcompletedBook(scanner.nextLine());
			    userArr[x] = usr;
			}

			// Display user information (optional)
			System.out.println("\nUser Information, will display to keep records of your personal choices in the MagicOfBooks Library :");
			for (User user : userArr) {
			    System.out.println("User ID: " + user.getuserId() + ", Name: " + user.getUserName() + ", emailID: " + user.getemailId()
			    + ",Password: " + user.getPassword() + ",newBooks:" + user.getNewBooks() + ", favouriteBook: " + user.getfavouriteBook() + 
			    ",completedBook: " + user.getcompletedBook());
			    System.out.println("Thanks for using the library resources!" );
			    System.out.println("------------------------------\n##########"	);
		}
    }

    public void selectBook() {  //SelectBook
        try {
        	
			System.out.println("Enter new book title, And:");
			String BookTitle = scanner.nextLine(); // Read the book title as a string
			System.out.println("The Book Description  for this book: "); //Book detail
			String bookDescription = scanner.nextLine();
            System.out.println("Enter the Book Author for this book:");
            String author = scanner.nextLine();
            
			Book newBook = new Book(BookTitle, bookDescription, author);
			books.put(nextBook_Id, newBook);
			System.out.println("Book '" + BookTitle + "' added with ID " + nextBook_Id + "'Descritption"+ "Author");
		
			  nextBook_Id++;
        } catch (NoSuchElementException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
        }
    
    public void displayBooks() {  //Display a book
        System.out.println("\nBooks in the collection:");
        for (HashMap.Entry<Integer, Book> entry : books.entrySet()) {
            int bookId = entry.getKey();
            String name = entry.getValue().getBookTitle();
            String author =entry.getValue().getAuthorName();
            String bookDescription = entry.getValue().getBookDescription();  //Get book details
            System.out.println("ID " + bookId + ": " + name + ", Book Description " + bookDescription +  ", AuthorName" + author);
        
        }
    }
    public void menu() {
         //Adding books to the Books Collection {
        try{
			System.out.println("\nMagic of Books Menu:");
			System.out.println("1. Select a book");
			System.out.println("2. Display all books");
			System.out.println("3. Exit");
			System.out.print("Enter your choice_ ");
		    System.out.print("New Collection of Books Added: ");
			 //if (scanner.hasNextInt()) { 
			int choice=0;
		       choice = scanner.nextInt();
           switch (choice) {
			    case 1:
			        selectBook();
			        break;
			    case 2:
			        displayBooks();
			        break;
			    case 3:
			        System.out.println("Have a magical day!");
			        break;
			       
			    default:
			        System.out.println("Invalid choice. Please try again.");
			        
			       menu();
			
			  	 	 
           // (java.util.InputMismatchException e) {
   System.out.println("Invalid input. Please enter a valid integer.");}
        scanner.next(); // Consume the invalid input
   
			//return scanner.nextInt();
    } catch (java.util.InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid integer.");
    }
    
    }   //Scanner close;    
    
   

	public static void main(String[] args) {
        MagicBooksMain magicLibrary = new MagicBooksMain();
        magicLibrary.validateUser();
        magicLibrary.selectBook();
        magicLibrary.displayBooks();
        magicLibrary.menu();
        
      
    }
}

































	