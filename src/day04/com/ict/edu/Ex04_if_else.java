package day04.com.ict.edu;

public class Ex04_if_else {
	public static void main(String[] args) {
			//if ~ else 문
			//조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
			//형식) if (조건식){
			//         조건식이 참일때 실행할 문장;
			//         조건식이 참일때 실행할 문장;
			//     }else{
			//         조건식이 거짓일때 실행할 문장;
			//         조건식이 거짓일때 실행할 문장;
			//     }
			
			// int k1 이 60 이상이면 합격 아니면 불합격
			int k1 =79;
			String str = "";
			if (k1 >= 60) {
				str = "합격";
			} else {
				str = "불합격";
			}
			
			System.out.println("결과: "+ str);
			
			//int k2가 홀수있지, 짝수인지 판별하자
			
			int k2 = 1;
			str ="";
			if (k2 %2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			} 
			
			System.out.println("결과: "+str);
			
			
			//char k3가 대문자인지, 대문자가 아닌지 판별하자
			
			char k3 = 'D';
			str = "";
			if (k3 >= 'A' && k3 <= 'Z') {
				str = "대문자";
			} else {
				str = "대문자가 아님";

			}
			System.out.println("결과: " + str);

			// 근무시간이 8시간 까지는 시간당 9620이고
			//8시간을 초과한만큼 1.5
			//현재근무시간 10
			//얼마를 받아야하는가.
			// 또틀림
			int dan =9620;
			int time = 10;
			int limit = 8;
			int pay = dan*limit ;
			
			if (time > limit){
		    pay = (limit*dan) + (int)((time-limit)*dan*1.5) ;
			} else {
			pay = dan*limit;
			}
			System.out.println("결과: "+ pay);		
		}
}
