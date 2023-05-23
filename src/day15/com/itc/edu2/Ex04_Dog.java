package day15.com.itc.edu2;

public class Ex04_Dog extends Ex04_abstract{
	String name = "개똥이";
	public void sound() {
		System.out.println("멍멍");
	}
	public void play() {
		System.out.println("들에서놀기");
	}
	public String getName() {
		return name;
	}
}
