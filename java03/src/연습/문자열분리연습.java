package 연습;

//import java.util.Scanner;

public class 문자열분리연습 {

	public static void main(String[] args) {
		String ph = "011-245-1234";
//		Scanner kb = new Scanner(System.in);
//		System.out.print("전화번호입력>> ");
//		String ph = kb.next();
//		kb.close();
//		String s = ph.trim();
		
		// 3
		String com = " ";
		String ph1 = ph.substring(0, 3);
		if (ph1.equals("011")) {
			com = "SK";
		}
		else if (ph1.equals("019")) {
			com = "LG";
		}
		else {
			com = "Apple";
		}
		System.out.println(com);
		
		// 4
		String on = " ";
		char ph2 = ph.charAt(7);
		if (ph2 == '-') {
			on = "올드폰";
		}
		else {
			on = "최신폰";
		}
		System.out.println(on);
		
		
		//5
		if (ph.length() >= 10) {
			System.out.println("유효한 전화번호");
		}
		else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		
		
		
		
		//
		String s2 = "감자,고구마,양파";
		String[] s3 = s2.split(","); // {"감자", "고구마", "양파"}
		System.out.println(s3[0]);
		
		String[] ph3 = ph.split("-");
		if (ph3[1].length() >= 4) {
			System.out.println("최신폰");
		}
		else {
			System.out.println("올드폰");
		}
	}

}
