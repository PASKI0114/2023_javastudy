package day07.com.ict.edu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 원하는 회수를 입력받고
		// 숫자를 입력받아서 입력바든 숫자가 홀수인지 짝수이지 판별하자.

		System.out.print("원하는 횟수: ");
		int su = scan.nextInt();
		String res = "";
		for (int i = 0; i < su; i++) {
			System.out.print("숫자입력:");
			int num = scan.nextInt();
			if (num % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println("당신이 입력한 " + num + "은" + res + "이다.");
		}

	}
}
