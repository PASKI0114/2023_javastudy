package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		//단순 if문 boolean형-(boolean/비교연산자/논리연산)
		//거짓으로민 실행 시키고싶음. !주면 거짓으로 바뀜
		//단순 if문 : 조건식이 참일때만 실행. 거짓이면 if문 무시
		//형식) if(조건식){
		//          조건식이 참일때 실행할 문장;
		//          조건식이 참일때 실행할 문장;
		//       }
		//단, 실행문장이 한줄이면 {}블록을 생략할수있다.
		
		//형식) if(조건식) 조건식이 참일때 실행할 문장;
		//형식) if(조건식)
		//          조건식이 참일때 실행할 문장;
		
		//int k1 =60이상이면 합격
		int k1 = 55;
		String res = "초기값";
		if (k1 >= 60) {
			res= "합격";
		}
		
		if (k1 < 60 ) {
			res= "불합격";
			}
		
		System.out.println("결과: "+res);
		
		//int k2가 홀수냐 짝수냐
		int k2 = 37;
		res = "짝수";
		if (k2%2 == 1) {
			res = "홀수";
		}
		
		System.out.println("결과: "+res);
		
		//char k3가 대문자인지 아닌지 판별하자.
		char k3  = 'a';
		res= "대문자 아님";
		if (k3 >= 'A' && k3 <= 'Z' ) {
			res = "대문자";
		}
		System.out.println("결과: "+res);		
		
		// 근무시간이 8시간 까지는 시간당 9620이고
		//8시간을 초과한만큼 1.5
		//현재근무시간 10
		//얼마를
		int time = 10;
		int dan = 9620;
		int limt = 8;
		int pay = time * dan;
		if (time > limt) {
			pay = (limt * dan) + (int) ((time - limt) * dan * 1.5);
		}
		System.out.println("결과: " + pay);

	}
}
