package day13.com.ict.edu;

public class Ex01_Construtor {
	//this의 this
	//this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//		 지역변수와 전역변수 이름이 같을때 전역변수앞에 this를 붙인다.
	
	//this() : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	
	private String name = "홍길동";//이건 만들어진거
	private int age = 34;
	
	//Ctrl+space 누르면 생성자 나옴
	public Ex01_Construtor() {
		//생성자가 다른 생성자 호출(반드시 첫번째 줄에서)
		this("임꺽정");//-프라이빗인데도 this라 접근가능
		System.out.println("기본 생성자 :" + this);
		
		//생성자에서 메서드를 호출
		//prn();
		//this.prn(); //p1.prn과 같다
	}
	
	//생성자 오버로딩(같은 이름의 생성자가 2개 이상 있음)-딱 한번 바꿔짐
	public Ex01_Construtor(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {//이 네임은 안만들어짐
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void prn(){
		
	}
	
	
}
