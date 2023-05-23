package day20.com.ict.edu2;

// join() : 현재 스레드는 join()을 호출한 스레드가 끝날때까지
//			대기상태로 빠져있다가 join()을 호출한 스레드가 끝나면
//			다시 실행한다.
//			즉 join()을 호출한 스레드가 끝나야 실행 할수있다.

public class Ex01_Join {
	public static void main(String[] args) {
		System.out.println("Main: "+Thread.currentThread().getName());
		
		Ex01 test = new Ex01();
		Thread dog = new Thread(test,"dog");
		Thread cat = new Thread(test,"cat");
		//dog.setDaemon(true); //반대개념
		dog.start();
		cat.start();
		
		try {
			dog.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main : "+Thread.currentThread().getName());
	}
}
