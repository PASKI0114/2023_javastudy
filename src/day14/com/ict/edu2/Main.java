package day14.com.ict.edu2;

public class Main {
	public static void main(String[] args) {
	Mp3_phone mp3 = new Mp3_phone();	
	mp3.call();
	mp3.sms();
	mp3.sound();
	System.out.println();
	
	Dca_Phone dca = new Dca_Phone();
	dca.call();
	dca.sms();
	dca.picture();
	}
}
