package 연습;

public class 배열기초확인 {

	public static void main(String[] args) {
		// 1
		int [] data = new int [5];
		
		// 2
		System.out.println(data.length);
		
		// 3
		data[0] = 100;
		System.out.println(data[0]);
		
		// 4
		data[data.length - 1] = 500;
		System.out.println(data[data.length - 1]);
		
		// 5
		data[2] = 200;
		System.out.println(data[2]);
		
		// 6
		for (int x : data) {
			System.out.println(x);
		}
		
		// 7
		for (int i = 0; i < data.length; i++) {
			System.out.println(i + " : " + data[i]);
		}
		
		// 좋아하는 여행지 5
		String [] trip = new String [5];
		trip[0] = "제주도";
		trip[1] = "런던";
		trip[2] = "괌";
		trip[3] = "후쿠오카";
		trip[4] = "하와이";
		for (String x : trip) {
			System.out.print( x + " " );
		}
		System.out.println();
		
		// 좋아하는 색깔 5
		char [] color = new char [5];
		color[0] = 'w';
		color[1] = 's';
		color[2] = 'p';
		color[3] = 'v';
		color[4] = 'b';
		for (char c : color) {
			System.out.print( c + " " );
		}
		System.out.println();
		
		double [] height = new double [5];
		height[0] = 165.5;
		height[1] = 174.0;
		height[2] = 178.0;
		height[3] = 160.0;
		height[4] = 162.0;
		for (double d : height) {
			System.out.print( d + " " );
		}
		
	}

}
