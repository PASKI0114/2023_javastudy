package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		// 카페모카가 6500원
		// 친구와 둘이서 15000원을 내고 주문했다. (2잔)
		// 잔돈은 얼마인가. (단, 부가세 10% 포함)

		String coffee = "카페모카";

		int price = 6500;
		int money = 15000;
		int plople = 2;

		// 부가세를 구하기 위하여 총금액를 구하자.
		int total = price * plople;

		// 둘중 하나만 사용하자.
		int vat = total / 10;
		int vat2 = (int) (total * 0.1);
		int out = money - (total + vat);

		System.out.println("잔돈 : " + out);

		// 한번에 처리함
		int out2 = money - (int) (total * 1.1);
		System.out.println("잔돈 : " + out2);

	}
}
