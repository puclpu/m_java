package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "남성";
		p.name = "클라크";
		System.out.println(p);

		System.out.println("");
		
		Man m = new Man();
		m.gender = "남성";
		m.name = "왓슨";
		m.size = 100;
		System.out.println(m);
		
		SuperMan s = new SuperMan();
		s.gender = "남성";
		s.name = "아서";
		s.size = 200;
		System.out.println(s);
		s.날아다니다();
		s.run();
		s.먹다();
		s.잠자다();
		
		System.out.println("");
		
		Woman w = new Woman();
		w.gender = "여성";
		w.name = "가돗";
		w.power = 100;
		System.out.println(w);
		
		WonderWoman ww = new WonderWoman();
		ww.gender = "여성";
		ww.name = "다이애나";
		ww.power = 200;
		System.out.println(ww);
		ww.춤추다();
		ww.악당과싸우다();
		
	}

}
