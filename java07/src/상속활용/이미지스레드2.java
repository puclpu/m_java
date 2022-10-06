package 상속활용;

public class 이미지스레드2 extends Thread {
	@Override
	public void run() {
		String[] img = {"토.jpeg", "햄.jpeg", "강.jpeg", "고.jpeg"};
		for (int i = 0; i < img.length; i++) {
			System.out.println("");
		}
	}
}
