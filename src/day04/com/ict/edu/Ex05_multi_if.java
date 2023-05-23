package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1){
		// 조건식1이 참일때 실행할 문장;
		// 조건식1이 참일때 실행할 문장;
		// }else if(조건식2){
		// 조건식1은 거짓이면서 조건식2가 참일때 실행할 문장;
		// 조건식1은 거짓이면서 조건식2가 참일때 실행할 문장;
		// }else if(조건식3){
		// 조건식1,2가 거짓이면서 조건식2가 참일때 실행할 문장;
		// 조건식1,2가 거짓이면서 조건식2가 참일때 실행할 문장;
		// }else{
		// 조건식1,2가 거짓이면서 조건식2가 참일때 실행할 문장;
		// }

		// int k1의 점수가 90이상이면 A학점, 80점 이상이면 B학점, 70이상이면 C학점, 나머지 F 학점

		int k1 = 78;
		String str = "0";
		if (k1 >= 90) {
			str = "A학점";
		} else if (k1 >= 80) {
			str = "B학점";
		} else if (k1 >= 70) {
			str = "C학점";
		} else
			str = "F학점";

		System.out.println(str);

		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자.

		char k2 = 'a';
		str = "0";
		if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";
		} else if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			str = "숫자";
		} else
			str = "기타문자";
		System.out.println(str);

		// char k3가 A,a면 아프리카, B,b이먄 브라질, C,c면 캐나다, 나머지는 한국 ( || )

		char k3 = 'c';
		str = "0";
		if (k3 == 'A' || k3 == 'a') {
			str = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			str = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			str = "캐나다";
		} else
			str = "한국";
		System.out.println(str);

		// menu가 1이면 카페모카 3500, 2면 카페라떼 4000, 3이면 아메리카노 3000
		// 4면 과일주스 3500이다. 친구와 두잔을 10000내고 먹었다.
		// 잔돈은 얼마인가? (부가세10%) 같은 음료만 선택가능

		/*
		 * int moka = 3500; int latte = 4000; int ameri = 3000; int juice = 3500; int
		 * money = 10000; int coin = 0;
		 * 
		 * int menu = 2; if (menu == 1) { coin = money-(int)((moka*2)*1.1); //블록 안에서 만들면
		 * 밖으로 나가면 사라진다)-불필요 } else if (menu == 2) { coin = money-(int)((latte*2)*1.1);
		 * } else if (menu == 3) { coin = money-(int)((ameri*2)*1.1); } else if (menu ==
		 * 4) { coin = money-(int)((juice*2)*1.1); } System.out.println("잔돈은 " + coin +
		 * "원이다." );
		 */
		int menu = 3;
		int in = 10000;
		int people = 2;
		int dan = 0;
		String drink = "";

		if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			drink = "카페라테";
			dan = 4000;
		} else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			drink = "과일쥬스";
			dan = 3500;
		}

		int total = dan * people;
		int vat = (int) (total * 0.1);
		int out = in - (total + vat);

		System.out.println("선택메누: " + drink);
		System.out.println("잔돈 : " + out);

	}
}
