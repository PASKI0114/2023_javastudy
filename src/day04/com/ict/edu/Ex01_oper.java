package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		//삼항 연산자 : 조건식 => 조건이 참일때와 거짓일때를 구분해서 실행한다.
		//요건 까다로워서 잘안씀(그래도 남이쓴건 볼줄 알아야한다)
		//형식) 자료형 변수이름 = (조건식) ? 조건식이 참일때 실행할 문장: 조건식이 거짓일때 실행할 문장.
		//**주의사항) 변수, 참일때 실행결과, 거짓일때 실행결과 모두 같은 자료형이어야한다.	
	
		//String str = () "참일때ㅣ거짓일때 = 0"
		String str = (true) ? "강아지" : "고양이" ;
		System.out.println("결과 "+ str);
		
		//int avg = 80 ; 
		double avg = 55.3;
		str = (avg >= 60) ? "합격" : "불합격" ;
		System.out.println("결과 "+ str);
		
		char c1= 'K';
		str = (c1>= 'a' && c1<='z') ? "소문자" :"소문자 아님" ;
		System.out.println("결과 "+ str); 
		
		//1또는 3이면 남자 아니면 여자
		int gender = 1 ;
		str = (gender ==1 || gender == 3) ? "남자" : "여자" ;
		System.out.println("결과 "+ str); 
		
		//홀수이면 남자, 짝수면 여자
		gender = 4;
		str = (gender % 2 == 1) ? "남자" : "여자";
		System.out.println("결과 " + str);
		
		//3의 배수인지 아닌지 맞춰라.
		int su1 = 157;
		str = (su1 % 3 == 0) ? "맞다" : "아니다" ;
		System.out.println("결과 "+ str); 
		
		
		
		
		//근무시간이 8시간 까지는 시간당 9620이고
		//8시간을 초과한 시간 만큼은 1.5배 지급한다.
		//현재 근무한 시간이 10이다.
		//얼마를 받아야하는가.
		//기존 근무시간에 일한시간이 오버되면 1.5배가 붙고 시간만큼 추가금 지급
		
		
//	    int money = 9620;
//	    int work = 8;
//	    int time = 10;
//	    double extra = (int)(money * 1.5);
//	    int extra1 = (int)(extra);
//	    
//	    int result = (time > work) ? work*money + (time-work)*extra1 : time*money ; //int로 써야함
//        //             시간조건           기본급            추가급             기본
//		
//		System.out.println("결과: "+ result + "원입니다."); 
		
		//분기: 초과를 했느냐 안했느냐 >8
		
		int time = 10;
		int dan = 9620;
		
		int pay = (time > 8) ?  (8 * dan) + (int)((time-8)*dan*1.5)   : time * dan  ;
				
		System.out.println("결과: "+ pay + "원입니다."); 	   
		
		
		// 큰숫자 찾기
		int num1 = 47;
		int num2 = 32;
		
		int res = (num1 > num2) ?  num1 : num2 ;
		
		System.out.println("큰값: "+ res); 	 
		
		//Math.max(pay, res)-단점 2개 비교 밖에 못함.
	    int res2 = Math.max(num1, num2);
	    		
	    System.out.println("큰값: "+ res2); 	    		
	    		//팀숙제-Math 클래스에 나오는 메소드 10개 조사하기 조사하는거에 max는 뻬기
	    
	    //절대값?
	    int res3 = -38;
	    int res4 = (res3 > 0) ? res3 : res3*-1 ;
	    System.out.println("큰값: "+ res4); 		    		
	    
	    int res5 = Math . abs(res3);
	    System.out.println("큰값: "+ res5);	    		
	    
	    //삼항연산자 안에 삼항연산자
	    
	    
	    
	    

	}
}
