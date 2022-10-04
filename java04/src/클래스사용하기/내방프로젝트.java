package 클래스사용하기;

import 클래스만들기.강아지;
// class의 위치를 지정함. : import
import 클래스만들기.전화기;

public class 내방프로젝트 {

	public static void main(String[] args) {
		// 전화기
		전화기 p1 = new 전화기();
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나";
		
		p1.tel();
		p1.pic();
		
		// 전화기 1대 추가
		// 전화기 속성, 기능
		전화기 p2 = new 전화기();
		p2.size = 14;
		p2.speaker = "boss";
		p2.tel();
		p2.pic();
		
		// 강아지
		강아지 d1 = new 강아지();
		d1.name = "오복이";
		d1.weight = 3.5;
		d1.wang();
		d1.run();
		
	}

}
