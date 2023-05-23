package day15.com.itc.edu3;
//인터페이스 상속
//1.자식클래스가 일반클래스인 경우 반드시 오버라이딩 해야한다.(implement)
public class Ex01_extends implements Ex01_interface{

	@Override
	public void sound() {
		System.out.println("음악듣기");
		
	}

	@Override
	public void play() {
		System.out.println("게임하기");
		
	}

}

//자식 클래스를 추상클래스로 만들면 오버라이딩을 할 필요가 없다.(implements)
abstract class Ex01_extends2 implements Ex01_interface{
	String name = "홍길동";
	public void tour() {
		System.out.println("여행하다");
	}
}
//3번째 자식클래스를 인터페이스로 만들면 오버라이딩을 할필요가없다.(interface)
interface Ex01_extends3 extends Ex01_interface{
	
}
//Ex01_extends2 추상클래스를 일반 클래스가 상속받자
class sound extends Ex01_extends4{

	@Override
	public void sound() {
	
	}

	@Override
	public void play() {
	
	}
	
}

