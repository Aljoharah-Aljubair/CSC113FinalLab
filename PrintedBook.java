
public class PrintedBook extends Book{
	private int pages;
	
	PrintedBook(int isbn , int y , int p){
		super(isbn , y);
		pages = p;
	}
	
	//toString ?
	public String toString() {
		return super.toString()+ " Pages:" + pages ; 
	}

}
