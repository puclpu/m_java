package 스레드;

public class 증가감소 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		// start() 메서드 호출
		t1.start();
		t2.start();
		
	}

}
