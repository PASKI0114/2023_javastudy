package day03.com.ict.edu2;

public class Test02_1 {
	public static void main(String[] args) {
		// 2시간 40분 30초는 초로 몇초일까요?

		int time = 2;
		int minute = 40;
		int second = 30;

		int result = time * 60 * 60 + minute * 60 + second;
		System.out.println(result);

	}
}
