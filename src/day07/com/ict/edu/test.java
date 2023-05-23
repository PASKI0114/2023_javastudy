package day07.com.ict.edu;

public class test {
	public static void main(String[] args) {
		// 내가 시험때 쓴거

		String name = "홍길동";
		int ko = 95;
		int en = 85;
		int jp = 85;

		int sum = ko + en + jp;
		double avg = (double) (sum) / 3;
		double avg1 = (int) ((avg * 10) / 10.0);
		System.out.println(name + "+" + sum + "+" + avg1);

		int t = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int etc = 0;

		h = t / (60 * 60);
		etc = t % (60 * 60);
		m = etc / 60;
		s = etc % 60;

		System.out.println(h + "시" + m + "분" + s + "초");

		int moka = 8500;
		int p = 2;
		int pay2 = 20000;
		int bu = (moka) / 10;
		int res = (pay2 - ((moka + bu) * p));

		System.out.println(res);

		int su1 = 4;
		String str = (su1 % 2 == 1) ? "홀" : "짝";
		System.out.println("결과 " + str);

		char k2 = 'a';
		str = "";
		if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";
		} else {
			str = "대문자가 아님";

		}
		System.out.println("결과: " + str);

		int time = 10;
		int money = 9620;
		int work = 8;
		int pay = time * money;
		if (time > work) {
			pay = (work * money) + (int) ((time - work) * money * 1.5);
		} else {
			pay = work * money;
		}
		System.out.println("결과: " + pay);

	}

}