package day03.com.ict.edu2;

public class Test01 {
	public static void main(String[] args) {
		//이름이 홍길동인 사람의 점수가
		//국어 90, 영어 80, 수학 80점이다.
		//총점과 평균을 구하자
		//화면 출력은 이름, 총점, 평균만 출력하자.
		//단, 평균의 소수점 첫재자리까지 구하자
		
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		int sum = kor + eng + math ;
		
		double avg = (double) (sum) / 3;      //83.33333333333333   int를 double로 전환
		double avg1 = (int)(avg*10)/10.0;  //833->83.3 으로 전환   double를 int로 전환
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg1);
		
	}
}
