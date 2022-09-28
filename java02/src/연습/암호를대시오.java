package 연습;

import java.util.Scanner;

public class 암호를대시오 {

	public static void main(String[] args) {

		String pass = "pass";
		
		Scanner kb = new Scanner( System.in );
		
		System.out.print("암호를 대시오: ");
		String pw = kb.next();
		kb.close();
		
		if (pw.equals(pass)) {
			System.out.println("들어오세요.");
		}
		else {
			System.out.println("나가세요.");
		}
		
	}

}
