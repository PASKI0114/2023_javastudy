package day15.com.itc.edu2;

public abstract class Ex04_abstract {
	String name = ""; 
	
	public abstract void sound() ;
	
	public void play() {
		System.out.println("산에서 놀기");
	}
	public String getName() {
		return name;
	}
}
