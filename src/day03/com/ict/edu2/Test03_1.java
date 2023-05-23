package day03.com.ict.edu2;

public class Test03_1 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초인가?
		int time = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0;

		h = time / (60 * 60); // 1
		res = time % (60 * 60); // 나머지 389분
		m = res / 60; // 6
		s = res % 60; // 20 //이게 남은 값
		System.out.println(time + "초는 " + h + "시간, " + m + "분, " + s + "초입니다.");

	}
}
