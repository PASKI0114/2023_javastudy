package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08_Constuctor coffee = new Ex08_Constuctor("커피음료", 1000);
		Ex08_Constuctor ion = new Ex08_Constuctor("이온음료", 1500);
		Ex08_Constuctor cola = new Ex08_Constuctor("탄산음료", 1200);
		Ex08_Constuctor juice = new Ex08_Constuctor("과일음료", 1800);
		// 반환추가
		Ex08_Constuctor re = new Ex08_Constuctor("반환", 0); // 이거 안빠진다ㅜㅠ
		// 반환 버튼
		Ex08_Constuctor[] arr = { coffee, ion, cola, juice, re };

		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 투입하세요>>>> ");
		int input = scan.nextInt();

		String drink = "";
		int i = 0;
		int output = 0;

		// 음료들의 최소금액
		if (input < 1000) {
			System.out.println("금액이 부족합니다");
			System.out.println("넣은돈: " + input);

		} else {
			// System.out.println("커피\t이온\t탄산\t과일\t반환");
			// 진행
		}

		// 입력금액과 각 음료수의 가격을 비교 // 결국 while문 //반환항목제외 기억 모르겠음
		while (true) {
			for (i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) { // 화살표아닌데착각하지말고
					System.out.print(arr[i].getName() + "\t");// 계산값
					System.out.println(arr[i].getPrice() + "\t");// 계산값
				}
			}
			System.out.print("음료를 선택하세요 (두글자만적기) : ");
			drink = scan.next();

			switch (drink) {
			case "커피":
				output = input - arr[0].getPrice();
				break;
			case "이온":
				output = input - arr[1].getPrice();
				break;
			case "탄산":
				output = input - arr[2].getPrice();
				break;
			case "과일":
				output = input - arr[3].getPrice();
				break;
			case "반환":
				output = input;
				System.out.println("잔돈 " + output + "원이 반환됩니다.");
				return;

			default:
				System.out.println("잘못 선택하셨습니다.");
				output = input;// 이게 왜 반환,0이 되는거지
				continue; // 이걸써야 아래까지 안내려감 내부반복
			}
			if (output >= 0) {
				System.out.println();
				System.out.println("선택하신 음료가 나왔습니다.");
				System.out.println("잔돈 : " + output);
				System.out.println("=========================");
				System.out.println();
				input = output;
			} else {
				System.out.println();
				System.out.println("선택할 수 있는 음료가 없습니다.");
				System.out.println("잔돈 " + input + "원이 반환됩니다.");
				System.out.println("=========================");
				return;

			}
		}

	}
}