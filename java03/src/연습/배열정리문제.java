package 연습;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		// 1
		int[] data = new int[5];
		for (int i = 0; i < data.length; i++) {
			System.out.print("숫자 입력 >>  ");
			data[i] = kb.nextInt();
		}
		System.out.println(data[0] + data[2]);

		System.out.println("------------------");

		// 2
		String[] j = new String[3];
		j[0] = "자바";
		j[1] = "스프링";
		j[2] = "JSP";
		System.out.println(j[0] + " 보다는 " + j[1]);
		
		kb.close();
	}

}
