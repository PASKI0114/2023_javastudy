package day20.com.ict.edu2;

public class Ex01 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Run: "+Thread.currentThread().getName());
		}
	}
	
	public void sound() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Sound: "+Thread.currentThread().getName());
		}
	}
}
