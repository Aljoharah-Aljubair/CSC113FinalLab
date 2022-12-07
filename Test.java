public class Test {
public static void main(String[] args) {

		Bookstore[] bookstoresArray = new Bookstore[4];
		bookstoresArray[0] = new Bookstore("Jarir Bookstore", 20);
		bookstoresArray[1] = new Bookstore("Obeikan Bookstore", 5);
		bookstoresArray[2] = new Bookstore("Alsharq Bookstore", 11);
		bookstoresArray[3] = new Bookstore("Virgin Megastore", 30);

		Book[] booksArray = new Book[5];
		booksArray[0] = new PrintedBook(97814, 1813, 432);
		booksArray[1] = new PrintedBook(97803, 2006, 544);
		booksArray[2] = new EBook(97800, 2019, "t.ly/f10c", 4);
		booksArray[3] = new EBook(97802, 2020, "t.ly/P7Nb", 3);
		booksArray[4] = new EBook(97819, 2023, "t.ly/-mWE", 5);

		/*
		 * 1. Add all the books in the booksArray array to Jarir Bookstore. 
		 */
		
		for(int i = 0 ; i < booksArray.length ; i++ ) {
			bookstoresArray[0].addBook(booksArray[i]);
		}
		 
		 
		/* 
		 * 2. Write the eBooks information along with their times opened percentage
		 * from Jarir Bookstore into a text file named â€œeBooks.txtâ€‌.
		 */

		for( int i = 0 ; i < booksArray.length ; i++) {
			if( booksArray[i] instanceof EBook)
				bookstoresArray[0].reportEBooks("eBooks.txt");
		}
	
		/*
		 * 3. Create a BookstoreList object and name it as â€œlistâ€‌.
		 */
		
		BookstoreList list = new BookstoreList();

		
		/*
		 * 4. Insert all the bookstores in the bookstoresArray array to the list in the
		 * same order as they are defined and initiated.
		 */
		for(int i = 0 ; i < bookstoresArray.length ; i++)
			if(bookstoresArray[i] != null) 
				list.insertInOrder(bookstoresArray[i]);
			
		/* 
		 * 5. Print the list. 
		 */
		list.print();
	}

}