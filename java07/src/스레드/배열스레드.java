package 스레드;

public class 배열스레드 extends Thread {
	
	
	@Override
	public void run() {
		String[] s = {"복숭아", "딸기", "초코", "고구마"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> " + s[i]);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
