package 연습;

public class 형변환 {

	public static void main(String[] args) {
		int a = 100;
		byte b = 50;
		a = b;
		//자동형변환
		
		int c = 200;
		b = (byte)c;
		// 강제형변환
		// 조심할 것은 작은 공간에 들어갈 수 있는 범위만 가능!
	}
}
