import java.io.IOException;

public class InvalidYearException extends IOException {
	
	InvalidYearException(){
		super();
	}
	
	InvalidYearException(String m){
		super(m);
	}

}
