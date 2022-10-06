package 상속;

public class 매니저 extends 직원 {
	int bonus;
	
	public void test() {
		System.out.println("테스트하다.");
	}

	// 부모로부터 상속받은 메서드와 동일한 메서드를 재정의하는 경우
	// 덮어써버리게 됨 ==> 오버라이드(재정의)
	@Override
	public String toString() {
		return "매니저 [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn
				+ "]";
	}
	
}
