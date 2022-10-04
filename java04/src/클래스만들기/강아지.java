package 클래스만들기;

public class 강아지 {

	public String name;
	public double weight;
	
	public void wang() {
		System.out.println("멍멍");
	}
	
	public void run() {
		space(15);
		System.out.println("੯∙̀͡u\\__  /");
		space(15);
		System.out.println("\\  ___  \\");
		space(15);
		System.out.println("//      \\\\");

		space(10);
		System.out.println("੯∙̀͡u\\__  /");
		space(10);
		System.out.println("\\  ___  \\");
		space(10);
		System.out.println(" \\\\    //");

		space(5);
		System.out.println("੯∙̀͡u\\__  /");
		space(5);
		System.out.println("\\  ___  \\");
		space(5);
		System.out.println("//      \\\\");

		System.out.println("੯∙̀͡u\\__  /");
		System.out.println("\\  ___  \\");
		System.out.println("||     ||");
//		|੯∙̀͡u\__  /
//		|\  ___  \
//		| \ \  / /
	}

	private void space(int s) {
		for(int i = 0; i < s; i++) {
			System.out.print(" ");
		}
	}
}
