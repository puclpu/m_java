package 상속활용;

public class 찍기 {

	public static void main(String[] args) {
		// 1. Thread 상속받아 클래스를 3개 만들어놓음.
		// 2. new 이용해서 객체 사용
		카운터스레드 t1 = new 카운터스레드();
		시각스레드 t2 = new 시각스레드();
		이미지스레드 t3 = new 이미지스레드();
		
		// 3. 2번에서 만들어놓은 객체를 cpu실행 목록에 등록.
		t1.start();
		t2.start();
		t3.start();
	}

}
