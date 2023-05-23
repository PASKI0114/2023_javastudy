package day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재위치의 블록을 탈출하는 예약어(명령어)
		// continue : continue문을 만나면 아래 수행문을 포기하고 다음 회차를 하기위해서 증감식으로 이동
		// 보통 if문과 함께 사용한다.
		// break는 for문과 while 모두 사용, continue는 for문에 사용(while문에 사용가능)

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					break;
				System.out.println("i= " + i + ",j= " + j);
			}
		}
		System.out.println("=================================================");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 2)
					break;
				System.out.println("i= " + i + ",j= " + j);
			}
		}
		System.out.println("=================================================");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					continue;
				System.out.println("i= " + i + ",j= " + j);
			}
		}
		System.out.println("=================================================");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 2)
					continue;
				System.out.println("i= " + i + ",j= " + j);
			}
		}
		System.out.println("=================================================");
	}
}
