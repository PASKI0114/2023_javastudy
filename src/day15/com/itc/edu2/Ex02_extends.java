package day15.com.itc.edu2;

//추상클래스 상속했을때 처리 방법
//1. 부모클래스의 추상 메서드를 오버라이딩 하면서 내용을 구체화시킨다.=> 자식 클래스는 일반 클래스가된다.
//2. 자식 클래스도 추상클래스로 만들면 오버라이딩 하면서 내용을 구체화 시키지않아도 된다.
//	 즉, 자식클래스에 abstract를 붙인다
public abstract class Ex02_extends extends Ex01_abstract {

	@Override
	public void hobby() {
		System.out.println("게임하기");
	}
}
