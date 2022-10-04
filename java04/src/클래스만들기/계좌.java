// 슬랙
package 클래스만들기;

public class 계좌 {
	public String 이름;
	public String 계좌이름;
	public int 금액;
	
	public void 예금하다() {
		System.out.println(이름 + " 님이 " + 계좌이름 + "에 " + 금액 + "원을 입금하였습니다.");
	}
	
	public void 적금하다() {
		System.out.println(이름 + " 님이 " + 계좌이름 + "에 " + 금액 + "원을 적금하였습니다.");
	}
	
	public void 출금하다() {
		System.out.println(이름 + " 님이 " + 계좌이름 + "에서 " + 금액 + "원을 출금하였습니다.");
	}
}
