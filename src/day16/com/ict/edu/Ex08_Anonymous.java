package day16.com.ict.edu;
	//추상클래스 : 추상메서드를 하나이상 가지고있는 클래스

abstract class Abc{
	int data = 1000;
	public abstract void printData();
}

//제일 노멀한 방법
class AbcTest extends Abc{
	@Override
	public void printData() {
		System.out.println("data1 :" + data);
	}
}

class AbcTest2{
	//상속받지않고 바로 객체 생성
	Abc abc =  new Abc() {
	   //지역변수
		@Override
		public void printData() {
			System.out.println("data2 :" + data);
			
		}
	};
}

class AbcTest3{
	//메서드나 메서드 인자에 사용된다.
	public void prn() {
		new Abc() {
		//이름이 없으니	
			@Override
			public void printData() {
				System.out.println("data2 :" + data);
				
			}
		}.printData();//여기에서
	}
	
}

public class Ex08_Anonymous {
	public static void main(String[] args) {
		AbcTest t1 = new AbcTest();
		t1.printData();
		AbcTest2 t2 = new AbcTest2();
		System.out.println(t2.abc);
		t2.abc.printData();
		AbcTest3 t3 = new AbcTest3();
		t3.prn();
	}

}
