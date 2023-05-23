package day06.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
		/*
		 * do~while 문 : while문과 같은 반복문 단, 먼저 실행후 조건식이 붙는다. 형식) 초기식; do{ 실행문; 증감식;
		 * }while(조건식);
		 */

		// 0-10까지 출력

		int i = 0;

		do {
			System.out.println(i);
			i++;
		} while (i < 11);
		System.out.println("=================================================");
		// 0-10까지 홀수 출력
		i = 0;
		do {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++; // +1
		} while (i < 10);

		System.out.println("=================================================");

		// 7단 출력

		i = 1;

		do {
			System.out.println("7" + "X" + i + "=" + (7 * i)); // 안움직이는거 위치확인
			i++;
		} while (i < 10);
		System.out.println("=================================================");

		// 0-10홀수의 누적합
		int sum = 0; // 이전정보기억
		i = 0;
		do {
			if (i % 2 == 1) {
				sum = sum + i;// 누적합 공식
			}
			i++;
		} while (i < 11);
		System.out.println("결과 : " + sum); // 내부에 들어가면 값안나옴.
		System.out.println("=================================================");
	}
}
