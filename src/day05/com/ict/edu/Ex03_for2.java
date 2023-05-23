package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		// 중첩 for문 : for 문안에 또다른 for문이 존재하는
		/*
		 * for (int i = 1; i < 4; i++) { //3번돌고 System.out.println("실행문 -1"); for (int j
		 * = 1; j <6; j++) { //5번돌고 System.out.println("i= " + i + "j= " +j); }//안쪽 for문
		 * 끝 System.out.println("실행문 -1"); }//바깥 for문 끝
		 * 
		 * 
		 * for (int i = 2; i < 10; i++) { System.out.println(i+"단"); for (int j = 1; j
		 * <10; j++) { System.out.println(i + "x" + j + "=" + i*j ); }//안쪽 for문 끝
		 * 
		 * 
		 * //옆으로 가는거//한줄씩
		 * 
		 * for (int i = 2; i < 10; i++) { System.out.println(""); //고정 for (int j = 1; j
		 * <10; j++) { System.out.print(i + "x" + j + "=" + i*j + " "); //변환가능 }//안쪽
		 * for문 끝
		 * 
		 * }
		 * 
		 * for (int j = 1; j <10; j++) { System.out.println(""); for (int i = 2; i < 10;
		 * i++) { System.out.print(i + "x" + j + "=" + i*j + " "); }//안쪽 for문 끝 //이거
		 * 안됐으니까 다시해보기... 머리가 굳어서 안됨;;
		 * 
		 * }
		 */

		for (int i = 2; i < 10; i++) {
			System.out.println("");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j + " ");
			}
		}

		for (int j = 1; j < 10; j++) {
			System.out.println("");
			for (int i = 2; i < 10; i++) {
				System.out.println(i + "x" + j + "=" + i * j + " ");
			}

		}
	}
}
