package 상속;

public class 매장 {

	public static void main(String[] args) {
		직원 j = new 직원();
		j.name = "클라크";
		j.address = "메트로폴리스 32st";
		j.salary = 100;
		j.rrn = 10;
		
		매니저 m = new 매니저();
		m.name = "다이애나";
		m.address = "메트로폴리스 17st";
		m.salary = 200;
		m.rrn = 10;
		m.bonus = 100;
		
		System.out.println(j);
		System.out.println(m);
		m.test();

	}

}
