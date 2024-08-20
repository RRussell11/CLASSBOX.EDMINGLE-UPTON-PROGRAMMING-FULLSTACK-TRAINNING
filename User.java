package studpkg;

public class User {
	
	private String userName;
	private int userId;
	private String emailId;
	private String password;
	public String newBooks;
	public String favouriteBook;
	public String  completedBook;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getuserId() {
		return userId;
	}
	public void setuserId(int id) {
		this.userId = id;
	}

	
	public String getemailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}
	public String getNewBooks() {
		return newBooks;
	}
	public void setNewBooks(String newBooks) {
		this.newBooks = newBooks;
	}
	public String getfavouriteBook() {
		return favouriteBook;
	}
	public void setfavouriteBook( String favouriteBook) {
		this.favouriteBook = favouriteBook;
	}
	public String getcompletedBook() {
		return completedBook;
	}
	public void setcompletedBook( String completedBook) {
		this.completedBook = completedBook;
		
    }
	public String getPassword() {
		return password;
	}
	public void setpassword( String password) {
	    this.password=password;
	    
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", emailId=" + emailId + ", password=" + password
				+ ", newBooks=" + newBooks + ", favourites=" + favouriteBook + ", completedBook=" + completedBook + "]";
	}
	

	
}
	
	//private Object userValidation;
	/*private String emailId;
	private String password;
	public String newBooks;
	public String favourites;
	public String  completed;*/
	/*a userName
	b user Id
	c email id
	d password
	e newBooks(typebook)
	f favourite(type Book)
	g Completed(type Book)*/
	
	
	 
	
	
	
	


