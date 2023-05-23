package day16.com.ict.edu;
//static 내부클래스
public class Ex07_static {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;
	
	public Ex07_static() {
		System.out.println("외부생성자 : "+this);
	}
	
	public void play() {
		int money = 1000;
		System.out.println("외부메서드 :" +name);
		System.out.println("외부메서드 :" +money);
	}
	
	//내부클래스의 멤버변수가 static 이면 class를 static으로 만들어야한다.
	//권장사항은 아님(일반 클래스에서는 static사용못함)
	public  class Inner01{
		String addr ="서울 마포구";
		int roomNumber = 1;
		static int count = 30;
		
		public Inner01() {
			System.out.println("내부 생성자:"+this);
		}
		
		public void prn() {
			int weight = 79;
			System.out.println(addr);
			System.out.println(roomNumber);
			
			//외부클래스의 멤버도 마음대로 사용가능 (ㅔ걒ㅁㅅㄷ도 가능)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			
			//외부클래스의 메서드
			play();
		}
	}
}
