import java.io.*;

public class Bookstore {

	private String name;
	private Book[] bArray;
	private int ID, nOfB;

	public Bookstore(String n, int id) {
		name = n;
		ID = id;
		bArray = new Book[100];
		nOfB = 0;
	}

	/*
	 * Adds the received book to the bookstore in the first empty location of
	 * bArray, return true if the add process is completed successfully, or false
	 * otherwise.
	 */
	public boolean addBook(Book b) {
		
		if (bArray.length >= nOfB) return false;
		
		bArray[nOfB++] = b;
		return true;

	}

	/*
	 * Saves the bookstore’s eBooks information and the number of times it is opened
	 * in the text file named Gfname. Note that, all possible exceptions should be
	 * handled (caught) in the method by printing their corresponding messages.
	 */
	public void reportEBooks(String Gfname) {
		PrintWriter pw= null;
		try {
			 pw = new PrintWriter ( new FileOutputStream ( new File(Gfname)));
			
			for(int i = 0 ; i < nOfB ; i++) 
				if(bArray[i] instanceof EBook) {
					pw.println(bArray[i]);
					pw.println(((EBook)bArray[i]).timesOpened());
				}
			
			
		
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());	
		}
		pw.close();
	}

	
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}
}
