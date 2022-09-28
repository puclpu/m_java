package 연습;

import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date date = new Date();
		int h = date.getHours();
		
		if ( h < 11) {
			System.out.println("good morning!");
		}
		else if ( h < 15 ) {
			System.out.println("good afternoon!");
		}
		else if ( h < 19 ) {
			System.out.println("good evening!");
		}
		else {
			System.out.println("good night!");
		}
	}

}
