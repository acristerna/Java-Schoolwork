public class Book {
	
	//declaring attributes
	private String title;
	private String author; 
	private int year;
	private int totalPages;
	private int readingPos;
	
	//Building a constructor: purpose of a constructor is to create an object
	//Default constructor
	//public Book()
	
	//Parameterized constructor: initializing new book object
	public Book(String title, String author, int year, int totalPages)
	{
		//later on we are going to create a book object that the constructor will initialize the fields of the specific object
		this.title = title;
		this.author = author;
		this.year = year; 
		this.totalPages = totalPages;
		readingPos = 0;
	}
	
	//updateReadingPosition takes on int as a parameter and returns a boolean
	
	boolean updateReadingPosition(int newPos)
	{       //10       //100
		if(newPos <= totalPages) {
			readingPos = newPos; //10
		}         //10        //100        //There is still more to read to this will return true
		return readingPos < totalPages; 
	}
	
	//Purpose of toString is to represent objects as a string. 
	
	public String toString()
	{
		String output = title + "(" + year + ") by " + author;
		output = output + ", " + totalPages + " pages,";
		
		if(readingPos==totalPages)
		{
			output = output + " Finished Reading";
		}
		
		else
		{
			output = output + " at page " + readingPos;
		}
		
		return output;
		
		//Book b1 = new Book("Dante's Inferno", "Dante", 1320, 320);
		//SOP(b1);
		//Return: Dante's Inferno(1320) by Dante, 320 pages, at page 0
	}
	
	

}