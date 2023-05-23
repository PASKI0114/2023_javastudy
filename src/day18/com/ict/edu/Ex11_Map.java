package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성

		Scanner scan = new Scanner(System.in);

		System.out.println("나라의 이름을 입력하세요.");

		String input = scan.next();
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
			if (map.containsKey(input)) {
				System.out.println(map.get(input));
			} else {
				System.out.println("데이터없음");			
			}
			System.out.println("계속하시겠습니까? 네(y)/아니오(n)");
			String again = scan.next();
			while (true) {
				if (again.equals("y") || again.equals("n")) { // 둘중에 하나만
				} else {
					System.out.println("잘못된 입력입니다. 네(y)/아니오(n)");// 둘중에 아무것도 아닌경우
					again = scan.nextLine();
				}
			
		}
	}

}