package 클래스만들기;

public class 전화기 {

	// 공통적인 성질 : 사이즈, 스피커
	// >> 변수를 사용, 2개의 변수 필요
	// >> 멤버변수 : 값을 넣지 않고 선언만!
	//	  자동초기화 시켜줌.
	public int size; // 0으로 자동 초기화!
	public String speaker; // ""로 자동 초기화
	// 자동초기화시켜주는 것 > 멤버변수, 배열
	
	// 동작(기능)을 정의 : 통화하다, 사진찍다
	// 멤버메서드(함수)
	public void tel() {
		// 처리 내용 순서대로 작성
		System.out.println("전화기로 통화하다.");
	}
	public void pic() {
		System.out.println("전화기로 사진을 찍다.");
	}

}
