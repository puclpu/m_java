package 상속활용;

public class 카운트스레드2 extends Thread {
	@Override
	public void run() {
		for (int i = 100; i > 0; i++) {
			System.out.println(i);
		}
	}
}
