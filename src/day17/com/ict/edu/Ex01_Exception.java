package day17.com.ict.edu;

import java.util.Iterator;

// 예외처리 : try ~ catch ~
//	  목적 : 비정상적인 종료를 정상적인 종료로 유도하고,
//	        예외 발생 시 예외에 대한 처리를 해준다.
//	  형식 : try{
//			 예외 발생 가능한 문장들;
//			 예외가 발생 되면 아래 문장들을 무시하고, catch문으로 이동한다.
//			 예외 발생 가능한 문장들;
//			 예외 발생 가능한 문장들;
//			}catch(발생할 예외객체 e){
//             예외발생시 처리하는 문장;
//			}
public class Ex01_Exception {
			//예외처리라는뜻
	public static void main(String[] args) {
		try {
		int[] var = {10,20,30};
		for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var["	+i+		"]" +var[i]);
				System.out.println(3);
				System.out.println(4);
			}
				
			} catch (Exception e) { //정확한건 긴 문장 그대로지만 그냥 전부 Exception로 처리해도 됨
				System.out.println(e);
			}
		System.out.println("수고하셨습니다");
	}

}
