import java.io.Serializable;

import javax.swing.JOptionPane;

public abstract class Book implements Serializable{
	protected int ISBN;
	protected int year;
	
	Book( int isbn , int y){
		ISBN = isbn;
		try {
		if(  (y>0)  &&  (y<=2022) )
		year = y;
		
		else
			throw new InvalidYearException("Invalid year; the book year is set to the current year as a defult one");
		
		}catch(InvalidYearException ex) {
			year = 2022;
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		}
	
	public String toString() {
		return "ISBN:" + ISBN + " Year:" + year;
	}

}
