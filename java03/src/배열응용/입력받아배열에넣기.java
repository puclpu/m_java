package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {

		Scanner kb = new Scanner ( System.in );
		int [] data = new int [5];
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자입력>> ");
			data[i] = kb.nextInt();
		}
		kb.close();

		int sum = 0;
		for (int x : data) {
//			System.out.println(i);
			sum += x;
		}
		
		System.out.println(sum);
		System.out.println((double)sum / data.length);
	}

}
