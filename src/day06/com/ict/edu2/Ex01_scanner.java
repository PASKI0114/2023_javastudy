package day06.com.ict.edu2;

import java.util.Scanner; //crtl+shift+o

public class Ex01_scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 표준 츨력장치 (모니터)
		// System.in => 표준 입력장치 (키보드)
		// 회사에서 제공하는 클래스를 사용하기 위해서 import를 해야한다.

		// java.lang 패키지안에 존재하는 클래스는 아무런 제약없이 사용가능(import 안함)
		// java.lang 패키지안에 존재하는 클래스는 무조건 import를 해야한다.

		// import 방법) 1. 클래스 이름 뒤에서 ctrl + space
		// 2. ctrl +_shift +o

		Scanner scan = new Scanner(System.in);

		// .next(); 입력한 내용을 String으로 처리하는 메서드
		System.out.print("이름: ");
		// .next(); 입력한 내용을 String으로 처리하는 메서드
		String name = scan.next();
		System.out.println("받은내용 : " + name);

		System.out.print("나이: ");
		// .next(); 입력한 내용을 String으로 처리하는 메서드
		String age = scan.next();
		System.out.println("받은내용 : " + (age + 1));

		System.out.print("나이: ");
		// .nextInt(); 입력한 내용을 int로 처리하는 메서드
		int age2 = scan.nextInt();
		System.out.println("받은내용 : " + (age2 + 1));

		System.out.print("키: ");
		// .nextDouble(); 입력한 내용을 double로 처리하는 메서드(문자를 입력)
		double ke = scan.nextDouble();
		System.out.println("받은내용 : " + ke);

		System.out.print("당신은 남성입니까?(true/false) ");
		// 입혁한 내용을 boolean으로 처리하는 메서드(숫자 및 다른 문자 입력하면 오류)
		boolean gender = scan.nextBoolean();
		System.out.println("받은내용 : " + gender);
		if (gender) {
			System.out.print("당신은 남성입니다");
		} else {
			System.out.print("당신은 여성입니다");
		}
	}
}
