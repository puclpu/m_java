package 변수;

public class 기본데이터 {

	public static void main(String[] args) {
		// 기본 데이터 4가지: 정수, 실수, 문자, 논리
		// ram에 넣어보자.
		int age = 100; // 정수
		double height = 165.5; // 실수(8)
		char gender = '여'; // 문자1 => ' '
		boolean food = true; // 논리 true(1) / false(0)
		
//		기본데이터는 아닌데, 사람이 기본데이터처럼 너무 많이 써서
//		사용도 기본데이터처럼 할 수 있는 특별한 부품. String
		
		String name = "홍길";
		System.out.println( "이름는 " + name );
		System.out.println( "나이는 " + age );
		System.out.println( "키는 " + height );
		System.out.println( "성별은 " + gender );
		System.out.println( "점심을 먹었나? " + food );
	}

}
