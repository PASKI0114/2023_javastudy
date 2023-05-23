package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("원하는 반복 횟수: ");
		int su = scan.nextInt();

		System.out.print("원하는 단어: ");
		String str = scan.next();

		// for (int i = 0; i < su; i++) {
		// System.out.println(str);
		// }

		int i = 0;
		while (i < su) {
			System.out.println(str);
			i++;
		}

		/*
		 * 원하는 회수를 입력 받고 //입력 숫자를 입력 받아서 //입력 입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩 (엘즈)
		 * ----------------------------------------------
		 */
		System.out.print("원하는 횟수: ");
		int su1 = scan.nextInt();

		System.out.print("숫자: ");
		int su2 = scan.nextInt();

		i = 0;
		while (i < su2) {
			i++;

			if (su2 % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}

			System.out.println(su2 + "는 " + str + "입니다.");

		}

		/*
		 * 이름, 국어, 영어, 수학를 입력 받아서 //입력 총점, 평균, 학점을 구하고 //수식 이름, 총점, 평균, 학점을 출력하는 코딩 //출력
		 * (평균은 소숫점 첫째자리까지 구하자) ----------------------------------------------
		 */
		su = 0;
		su1 = 0;
		su2 = 0;
		int sum = 0;

		System.out.print("이름: ");
		str = scan.next();

		System.out.print("국어: ");
		su = scan.nextInt();

		System.out.print("영어: ");
		su1 = scan.nextInt();

		System.out.print("수학: ");
		su2 = scan.nextInt();

		sum = (su + su1 + su2);

		double avg = (double) (sum / 3);
		double avg1 = (int) ((avg * 10) / 10.0);

		String credit = "";
		if (avg1 >= 90) {
			credit = "A학점";
		} else if (sum >= 80) {
			credit = "B학점";
		} else if (sum >= 70) {
			credit = "C학점";
		} else
			credit = "F학점";

		System.out.println("이름: " + str + "\n총점: " + sum + "\n평균: " + avg1 + "\n학점: " + credit + "입니다.");

		/*
		 * 첫번째 숫자 받기 두번째 숫자 받기 연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		 */

		// 내일까지.
		int oper = 0;

		System.out.print("첫번째 숫자: ");
		int o1 = scan.nextInt();

		System.out.print("두번째 숫자: ");
		int o2 = scan.nextInt();

		System.out.print("연산자 받기: ");
		int o3 = scan.nextInt();

		if (o3 == 1) {
			oper = o1 + o2;
		} else if (o3 == 2) {
			oper = o1 - o2;
		} else if (o3 == 3) {
			oper = o1 * o2;
		} else if (o3 == 4) {
			oper = o1 / o2;
		}

		System.out.println("연산자 받아서 계산?: " + oper);

	}
}
