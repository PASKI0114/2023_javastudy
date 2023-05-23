package day19.com.ict.edu;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_Cat cat = new Ex04_Cat();
		Thread t_cat = new Thread(cat);
		//데몬스레드 : 일반스레드의 작업을 돕는 보조적인 역할을 수랭하는 스레드
		//			일반스레드가 종료되면 데몬 스레드는 강제로 종료됨
		t_cat.start();
		
		Ex04_Dog dog = new Ex04_Dog();
		Thread t_Dog = new Thread(dog);
		t_Dog.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}
}
