package 상속;

public class Man extends 사람 {
	// 멤버 변수 몇 개? 2개
	// 멤버 메서드 몇 개? 10
	int size;
	
	public void run() {
		System.out.println("빨리 달리다.");
	}

	@Override
	public String toString() {
		return "Man [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	
}
