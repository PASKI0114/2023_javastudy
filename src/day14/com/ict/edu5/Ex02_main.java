package day14.com.ict.edu5;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		dog.sound();
		System.out.println(dog.eyes);
		System.out.println(dog.color);
		System.out.println();
		
		cat.sound();
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		System.out.println();
		
		//객체생성
		//부모클래스 변수 = new 자식클래스 생성자();
		Ex02_Animal animal = null;
		int su = 1;
		if(su ==1) {	//고양이
			animal = new Ex02_Cat();
		}else if(su==2) {
			animal = new Ex02_Dog();
		}
		//오버라이딩
		animal.sound();
		//자식,부모가 같이 가지고 있는 변수
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		//자식클래스가 가지고 있는것은 사용못함
		//animal.play;
	}
}
