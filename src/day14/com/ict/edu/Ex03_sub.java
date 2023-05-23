package day14.com.ict.edu;

//자식 클래스에서 부모클래스를 선택해서 상속관계를 맺는다.
//상속관계 : 자식클래스가 부모클래스의 멤버필드와 멤버메서드를
//        마음대로 사용할수 있는 클래스간의 관계
//	 형식 : class 자식클래스 extends 부모클래스
//	 특징 : 모든클래스는 하나의 부모 클래스를 갖는다.
//		   부모클래스가 없으면 Object가 부모클래스이다.
//		   다중 상속을 지원하지않는다.(즉, 부모클래스는 하나만 존재한다.)
//		   다이얼그램에서는   자식클래스 → 부모클래스
//								   자식클래스 → 부모클래스
//		   위에 달린게없으면 오브젝트를 무조건 달고있다. 부모가 생기는 순간 없어지지만 부모의 오브젝트(부모는 연결된게 없으니)를 쓸수있음.
public class Ex03_sub extends Ex03_Super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "애옹이";
	static String computer = "10세대";
	
	public Ex03_sub() {
		System.out.println("자식클래스 생성자 : "+ this);
	}
	
	public void play() {
		String name = "홍두깨";
		//변수 우선 순위
		//지역변수 > 전역변수(this)> 부모클래스변수(super)
		System.out.println(name);       //홍두깨
		System.out.println(this.name);  //홍반장
		System.out.println(super.name); //홍길동
		
		//지역 변수가 없고, 전역변수, 부모클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight);
		
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		
		//private인 경우 
		System.out.println(cat);
		//상속이라도 접근불가.
		//System.out.println(dog);
		//System.out.println(super.dog);
		
		//static인 경우
		System.out.println(computer);
		System.out.println(this.computer);
		System.out.println(Ex03_sub.computer);
		
		//System.out.println(playstation);
		//System.out.println(this.playstation);
		//System.out.println(super.playstation);
		//System.out.println(Ex03_Super.playstation);
		
	
		
		
		
		
	}
	
	
	
	
	
	
}
