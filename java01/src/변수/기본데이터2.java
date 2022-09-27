package 변수;

public class 기본데이터2 {

	public static void main(String[] args) {
		// 정수==> 나이, 지갑, 금액, 우주
		byte age = 100; //127이하 (바이트)
		short wallet = 20000; // (2바이트)
		int money = 500000000; // 21억
		long space = 10000000000L; // 21억 이상인데 왜? long은 ㅣ 써줘야함
		
		// 실수==> 몸무게, 키
		double height = 183.5; // 8바이트
		float weight = 88.8F;
		
		// 문자1==> ' '
		char gender = '여';
		
		// 논리==> true/false
		boolean todayFinished = false;
		
		// 특별한 부품, 기본형은 아님
		// String(문자열)
		String name = "홍길동";
		
	}

}
