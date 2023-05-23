package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		// while 문은 for문과 같은 반복문
		// 형식1)
		// 초기식;
		// while(조건식){
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증강식;
		// }
		// while문의 끝을 만나면 조건식으로 간다.

		// 형식2)
		// 초기식;
		// while(true){
		// if(빠져나갈 조건문){
		// break;
		// }
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증강식;
		// }
		// while문의 끝을 만나면 조건식으로 간다.

		// 1-10까지 출력하자
		int i = 1;
		while (i < 11) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("====================");

		while (true) {
			if (i >= 11)
				break;
			{ // 빠져나가는 기준이라 부등호가 다름.
				System.out.println("i = " + i);
				i++;
			}
		}
		System.out.println("====================");

		// 0-10까지 짝수 출력
		i = 0;
		while (i < 11) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;

		}
		System.out.println("====================");

		// 구구단 중 7단 출력
		i = 1;
		while (i < 10) {
			System.out.println("7*" + i + " = " + (7 * i));
			i++;
		}
		System.out.println("====================");

		// 1-10누적합(합계구하기)
		int sum = 1;
		i = 0;
		while (i < 11) {
			sum = sum + i;
			System.out.println("Sum = " + sum);
			i++;
		}
		System.out.println("====================");

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		i = 1;
		while (i < 5) {
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("====================");

		i = 1;
		while (i < 17) {
			System.out.print("0");
			if (i % 4 == 0) {
				System.out.println("0");
			}
			i++;
		}

	}

}
