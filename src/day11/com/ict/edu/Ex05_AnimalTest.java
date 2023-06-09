package day11.com.ict.edu;

public class Ex05_AnimalTest {
	public static void main(String[] args) {
		//객체생성
		Ex05_Animal animal = new Ex05_Animal();
			
		//이름은 큰뿔소
		animal.setName("큰뿔소");
		
		//나이는 3
		animal.setAge(3);
		
		//생존여부 살아있음.
		animal.setLive(true);
		
	
		//결과 출력
		//System.out.println("이름: " + animal.getName());
		String m1 = animal.getName();
		System.out.println("이름 : " + m1);
		
		int m2 = animal.getAge();
		System.out.println("나이 : " + m2);
		
		boolean m3 = animal.getLive();
		if(m3){
			System.out.println("살았음");
		}else {
			System.out.println("즉었음");
		}
		System.out.println("================");
		
		//이름을 펭귄, 나이를 1, 생존여부 살아있음 으로 변경
		animal.setName("펭귄");
		animal.setAge(1);
		animal.setLive(true);
		
		
		//결과 출력
		String p1 = animal.getName();
		System.out.println("이름 : " + p1);
		
		int p2 = animal.getAge();
		System.out.println("나이 : " + p2);
		
		boolean p3 = animal.getLive();
		if(p3){
			System.out.println("살았음");
		}else {
			System.out.println("즉었음");
		}
		System.out.println("================");

		animal.play(14, false, "엄지");
		animal.prn();
		System.out.println("================");
		animal.play( 14 , "까치" , true );
		animal.prn();
	
	}
}
