package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		// 2시간 40분 30초는 초로 몇초일까요?

		int hour = 2;
		int minute = 40;
		int second = 30;
		int time = ((hour * 60 * 60) + (minute * 60) + second);

		System.out.println(hour + "시 " + minute + "분 " + second + "초는 " + time + "초입니다.");
	}
}
