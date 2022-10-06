package 상속;

public class Woman extends 사람 {
	int power;
	
	public void 춤추다() {
		System.out.println("춤을 추다.");
	}

	@Override
	public String toString() {
		return "Woman [power=" + power + ", gender=" + gender + ", name=" + name + "]";
	}
	
}
