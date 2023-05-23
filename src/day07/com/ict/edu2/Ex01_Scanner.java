package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체 횟수, 짝수횟수, 짝수가 나온퍼센트 구하기.(소숫점 첫째자리까지)
		int s1 = 0;
		double i = 0;
		double w = 0;
		while (true) {

			System.out.print("숫자입력: ");
			int su = scan.nextInt();
			i++;

			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
				w++;
			} else {
				str = "홀수";

			}

			System.out.println(su + "는 " + str + "입니다.");
			System.out.print("계속할까요?(1.yes, 2.no)>>");
			s1 = scan.nextInt();
			if (s1 > 2) {
				System.out.print("다시입력하세요.");
				System.out.println("계속할까요?(1.yes, 2.no)>>");
				s1 = 0;
				s1 = scan.nextInt();
			} else if (s1 == 2) {
				break;

			}
		}
		System.out.println("전체횟수:" + i);
		// 1을 몇번 눌렀나?
		System.out.println("짝수횟수:" + w);
		// 짝수횟수
		double per = (w / (i * 1.0)) * 100;
		System.out.println("짝수퍼센트:" + (int) (per * 10) / 10.0 + "%");
		// (퍼센트 구하기?)

		/*
		 * while(true) { System.out.print("숫자입력: "); int su = scan.nextInt(); String str
		 * = ""; if (su%2 == 0) { str = "짝수"; } else { str = "홀수"; }
		 * 
		 * System.out.println(su +"는 "+str+ "입니다.");
		 * System.out.print("계속할까요?(1.yes, 2.no)>>"); int s1 = 0; s1 = scan.nextInt();
		 * 
		 * if(s1 > 2) { System.out.print("다시입력하세요.");
		 * System.out.println("계속할까요?(1.yes, 2.no)>>"); s1 = 0; s1 = scan.nextInt();
		 * 
		 * } else if(s1 == 2) { break; } }
		 */

		// 숙제 : 지금한것의 단점은 2번만 스탑이고 나머지는 다 올라간다.
		// 나머지를 눌렀을때 다시 입력하세요하고 계속할까요가 뜨게해야한다.
		//다른 언어로 누를때가 안된다..
	}
}
