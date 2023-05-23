package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		int su = 3781;

		// 결과
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1

		int thousands = 0;
		int hundreds = 0;
		int tens = 0;
		int units = 0;
		int res = 0;

		thousands = su / 1000; // 3
		res = su % 1000; // 781

		hundreds = res / 100; // 7
		res = su % 100; // 81

		tens = res / 10;
		res = res % 10;

		units = res / 1;
		res = res % 1;

		System.out.println("천의 자리: " + thousands);
		System.out.println("백의 자리: " + hundreds);
		System.out.println("십의 자리: " + tens);
		System.out.println("일의 자리: " + units);

	}
}
