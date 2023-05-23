package day03.com.ict.edu2;

public class Test01_1 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어 90, 영어 80, 수학 80점이다.
		// 총점과 평균을 구하자
		// 화면 출력은 이름, 총점, 평균만 출력하자.
		// 단, 평균의 소수점 첫재자리까지 구하자

		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;
		int sum = kor + eng + math;

		// int avg = sum/3; -소수점 자리 안나옴
		double avg = (double) (sum) / 3; // 소수점 자리 구해야하니까 // 위치 잘보기
		// -여기 모르겠다
		double avg1 = (int) (avg * 10) / 10.0;
		// -더블안에 넣어야 더블로 계산되고 뒤에 10.0이 붙기때문에 더블.
		System.out.println(avg1);

	}
}
