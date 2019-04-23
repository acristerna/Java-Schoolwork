public class BookList {
	private String listName;
	private Book[] books;
	private int maxNoOfBooks;
	private int nextNumber;
	
	public BookList(String listName, int maxNoOfBooks) //Since we are using arraylist its flexible and we dont need to provide the max number of book but we need to keep it there for the testbooks to work because it'll receive it.  
	{
		books = new Book[maxNoOfBooks];
		this.listName = listName;
		this.maxNoOfBooks = maxNoOfBooks;
		this.nextNumber = 0;
	}
	
	public void addBook(Book b) {
		
		if(nextNumber <= maxNoOfBooks) 
		{
			books[nextNumber] = b;
			nextNumber++;
		}
	}
	
	public String toString()
	{
		String output = listName + "(" + nextNumber + ")\n";
		for(int i=0; i<nextNumber; i++)
			output +=  (books[i] + "\n" );
			
		
		return output;
	}
}

