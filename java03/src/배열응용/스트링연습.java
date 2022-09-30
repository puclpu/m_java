package 배열응용;

public class 스트링연습 {

	public static void main(String[] args) {
//		String sn = "9331212-1035715";
		String s = "나는 프로그래프야";
		String s2 = "진짜!!";
		
		System.out.println(s + s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		System.out.println(s.endsWith("야"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));
		System.out.println(s.contains(s2));
		System.out.println(s.lastIndexOf("프"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));
	}

}
