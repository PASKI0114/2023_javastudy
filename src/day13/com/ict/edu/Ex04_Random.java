package day13.com.ict.edu;

import java.util.Random;

public class Ex04_Random {
	public static void main(String[] args) {
		
	
	//난수를 발생하는 방법
	//문제 랜덤값이란?
	//Math.random(), Random 클래스
	
	// 1. Random 클래스
	Random ran = new Random();
	
	// 각종 기본 자료횽의 난수 발생 : 자료형 범위 안에서 난수 발생
	System.out.println("boolean형" + ran.nextBoolean());
	System.out.println("int형" + ran.nextInt());
	System.out.println("long형" + ran.nextLong());
	
	//double은 0.0 이상 ~ 1.0미만에서 난수발생
	System.out.println("double형:" + ran.nextDouble());
	
	//특정 범위를 지정하는 방법
	// 1.nextInt(범위) : 0~ 범위 전까지 난수 발생 (정수)
	System.out.println("int(범위) :" + ran.nextInt(5));//0~4
	
	//2. (int)(nextDouble()*범위) : 0 ~ 범위 전까지 난수발생 (정수)
	System.out.println("int(범위)" + (int)(ran.nextDouble()*5));//0~4
	
	//Math 클래스 : 전체 메서드가 static, 객체 생성없이 호출가능
	//1)random()
	System.out.println("Math.radom: " + Math.random());// 0.0 ~ 1.0미만
	
	//특정범위 지정
	System.out.println("Math.radom: 0~4 " + (int)(Math.random()*5));
	
	//올림, 버림, 반올림
	System.out.println("올림 : " +Math.ceil(3.45));
	System.out.println("올림 : " +Math.ceil(3.55));
	
	System.out.println("반올림 : " +Math.round(3.45));
	System.out.println("반올림 : " +Math.round(3.55));
	
	System.out.println("버림 : " +Math.floor(3.55));
	System.out.println("버림 : " +Math.floor(3.55));
	
	//1,가위바위보 게임
	//2. 높음 낮음을 맞추는 게임
	//3. 공통사항 : 계속할까요 사용
	//		    :승률구하기 퍼센트
	
	
	}

}
