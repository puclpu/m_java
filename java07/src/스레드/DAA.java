package 스레드;

public class DAA {

	public static void main(String[] args) {
		Dollar dollar = new Dollar();
		At at = new At();
		And and = new And();
		
		dollar.start();
		at.start();
		and.start();
	}

}
