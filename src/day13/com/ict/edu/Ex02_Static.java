package day13.com.ict.edu;

public class Ex02_Static {
	//static : 객체생성과 상관없이 미리 만들어짐
	//		   static영역에서 생성된다.
	//		   (객체생성전에도 호출가능 = 클래스이름)
	//		   공유 개념을 가진다.
	// 		   (모든 객체가 접근해서 사용할 수 있다.)
	//		   **클래스와 지역변수에는 사용할수 없다.
	//		   (내부클래스에서는 사용가능)
	int su1 = 10;
	static int su2 = 10;
	
	//기본생성자
	public Ex02_Static() {
		su1++;
		su2++;
	}
}
