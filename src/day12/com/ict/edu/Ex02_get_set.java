package day12.com.ict.edu;

public class Ex02_get_set {
	
	//직접접근을 막기위해 접근 제한자를 사용하자
	private String name = "홍길동";
	private String kkk = "";
	private int age = 24;
	private double weigh = 72.6;
	private boolean gender = true;
	public String getName() {
		return name;
	}
	
	//get()/set()을 이용
	public void setName(String name) {
		this.name = name;
	}
	//지역변수와 전역변수 이름이 같으면
	//전역변수에 this를 붙인다.
	//지역변수가 전역변수보다 우선순위가 높다.

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeigh() {
		return weigh;
	}
	public void setWeigh(double weigh) {
		this.weigh = weigh;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}