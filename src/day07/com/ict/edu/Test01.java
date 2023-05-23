package day07.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		// 1+ + + 누적합

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + (i * -1);
			} else {
				sum = sum + i;
			}

		}

		System.out.println("결과 :" + sum);
		System.out.println("============");

		// 농구공

		int k1 = 127;
		int res = k1 / 5;
		if (k1 % 5 != 0) {
			res = res + 1;
		}
		System.out.println("결과: " + res);
		System.out.println("============");
		// 0000
		// 0000
		// 0000
		// 0000

		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("============");
		// 1000
		// 0100
		// 0010
		// 0001

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}
		System.out.println("============");

		// 100 까지 총합

		int sum2 = 0;
		int cnt = 0;
		int i = 1;
		while (true) {
			if (i % 2 == 0) {
				sum2 = sum2 + (i * -1);
			} else {
				sum2 = sum2 + (i * 1);
			}
			cnt = i;
			if (sum2 >= 100) {
				break;
			}
			i++;
		}
		System.out.println(cnt);
	}
}
