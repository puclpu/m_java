package 상속활용;

import java.util.Date;

public class 시각스레드 extends Thread {
	@Override // 표시@ == annotation(어노테이션, 표시)
	public void run() {
		for (int i = 0; i < 20; i++) {
			Date date = new Date();
			System.out.println( "시각>> " + date );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
