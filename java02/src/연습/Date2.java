package 연습;

import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int month = date.getMonth(); 
		
		switch (month) {
		case 2:
			for (int i = 1; i < 29; i++) {
				System.out.print(i + " ");
			}
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			for(int i = 1; i < 32; i++) {
				System.out.print(i + " ");
			}

		default:
			break;
		}
	}

}
