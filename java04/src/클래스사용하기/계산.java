package 클래스사용하기;

import 클래스만들기.계산기2;

public class 계산 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int result = cal2.add(200, 100);
		double result2 = cal2.add(100, 22.2);
		double result3 = cal2.add(11.1, 22.2);
		String result4 = cal2.add("ok", 100);
		int[] result5 = cal2.add();
		int result6 = cal2.multi(3000, 4);
		
		System.out.println("더한 값 1은 " + result);
		System.out.println("더한 값 2는 " + result2);
		System.out.println("더한 값 3은 " + result3);
		System.out.println("더한 값 4는 " + result4);
		for (int i : result5) {
			System.out.println(i);
		}
		System.out.println("곱한 값 6은 " + result6);
		cal2.div(result6, 4);
	}

}
