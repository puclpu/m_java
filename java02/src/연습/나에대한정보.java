package 연습;

import java.util.Scanner;

public class 나에대한정보 {

	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in );

		System.out.print( "이름 입력>> " );
		String name = kb.next();

		System.out.print( "나이 입력>> " );
		int age = kb.nextInt();

		System.out.print( "취미 입력>> " );
		String hobby = kb.next();

		kb.close();

		System.out.println("----------------------");
		System.out.println( "나의 이름은 " + name );
		System.out.println( "나의 나이는 " + age + "세" );
		System.out.println( "나의 취미는 " + hobby + "입니다.!" );
	}

}
