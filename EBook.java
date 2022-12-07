
public class EBook extends Book implements Media{
	private String link;
	private double rate;
	
	EBook(int isbn , int y , String l , double r){
		super(isbn , y);
		link = l;
		rate = r;
	}
	
	public int timesOpened() {
		double timeOpenedPercentage = ( ( rate * 100 ) / year  ) * 100 ;
		return (int)timeOpenedPercentage;
	}
	
	//toString??
	public String toString() {
		return super.toString()+ " Link:"+link + " Rate:"+rate;
	}

}
