package day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("Main: "+Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		//Runnable를 start메서드를 가지고 있지 않으므로 오류발생
		//cat.start();
		
		Thread thread = new Thread(dog);	
		thread.start();
		
		//Thread thread2 = new Thread(cat);	
		//thread2.start();
		
		//익명(일회용)
		new Thread(cat).start();
		
		//익명: new 클래스(인터페이스 i);
		new Thread(new Runnable()) {
			@Override
			public void run() {
				while(true) {
					System.out.println("AAAAAAA"+Thread.currentThread().getName());
				}
			}
			}).start();
			
		System.out.println("Main: "+Thread.currentThread().getName());
	}
}
