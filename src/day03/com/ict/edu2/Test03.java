package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초인가?

		// int time = 3989;
		// int hour = time/(60*60);
		// int minute = time/60; //res값으로 하는거 까먹음(틀림)
		// int second = time%60;

		int time = 3989;
		int hour = 0; // 시
		int minute = 0; // 분
		int second = 0; // 초
		int res = 0; // 나머지

		hour = time / (60 * 60); // 1
		res = time % (60 * 60); // 389
		minute = res / 60; // 분
		second = res % 60; // 초

		System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초입니다.");

	}
}
