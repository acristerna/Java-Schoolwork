public class TestBooks {

	public static void main(String[] args) {
		//Use this code as your main. DO NOT CHANGE IT AT ALL.  You can add more tests at the end if you wish (not necessary)
		Book b1;
		Book b2;
		Book b3;
		BookList myBooks;
		BookList wishList;
		
		b1 = new Book("Through the Looking Glass", "Lewis Carrol", 1871, 140);
		b2 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 1865, 125);
		b3 = new Book("Principia Mathematica", "Alfred North Whitehead and Bertrand Russell", 1910, 509);
		
		myBooks = new BookList("My Own Books", 100);
		wishList = new BookList("Wish List", 10);
		myBooks.addBook(b1);
		myBooks.addBook(b2);
		wishList.addBook(b3);
		
		System.out.println("My current books:\n" + myBooks);
		System.out.println("My wish list books:\n" + wishList);
		
		Book b4;
		Book b5;
		b4 = new Book("A Theory of Data Structures", "William L Honig", 1975, 826);
		b5 = new Book("The Windup Girl", "Paolo Bacigalupi", 2009, 529);
		myBooks.addBook(b4);
		wishList.addBook(b5);
		
		b1.updateReadingPosition(145);  //beyond end, should not change the current position
		b2.updateReadingPosition(100);
		b3.updateReadingPosition(509);	//finished reading this one
		b5.updateReadingPosition(2);
		
		System.out.println("My current books:\n" + myBooks);
		System.out.println("My wish list books:\n" + wishList);
		
		//you are welcome to add more tests here, but you do not need to
		//DO NOT CHANGE ANYTHING ABOVE THIS POINT
		
	}

}