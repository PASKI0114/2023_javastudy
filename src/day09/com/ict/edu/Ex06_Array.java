package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		//스캐너
		//학급 인원 몇명?
		//이름 국어 영어 수학 입력받기
		
		//배열 다시 복습하기
		
		//미리 배열을 만든다.
		System.out.println("학생수: ");
		int su = scan.nextInt();
		
		//미리 배열을 만든다
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg= new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];
		
		for (int i = 0; i < su; i++) {
			System.out.print("이름: ");
			name[i] = scan.next();
			
			System.out.print("국어: ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어: ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학: ");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			
			if(avg[i] >= 90) {
				hak[i] = "A학점";
			}else if(avg[i] >= 80) {
				hak[i] = "B학점";
			}else if(avg[i] >= 70) {
				hak[i] = "C학점";
			}else{
				hak[i] = "F학점";
			}
			
			rank[i] = 1;
		
		}
		
		//순위
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(i ==j) continue;
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		//출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < su; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
			
		/*int su1 = 0;
		System.out.print("학급인원 수: ");
		su1 = scan.nextInt();
		
		String[]name = new String[su1];
		int[] kor = new int[su1];
		int[] eng = new int[su1];
		int[] math = new int[su1];
		
		int[] sum = new int[su1];
		double[] avg = new double[su1];
		
		System.out.print("국어점수"+kor);  //국어
		for (int i = 0; i < su1; i++) {
			kor[i] = scan.nextInt();
		}	
	
		System.out.print("영어점수"+eng);  //영어
		for (int i = 0; i < su1; i++) {
			eng[i] = scan.nextInt();
		}
		
		System.out.print("수학점수"+math);  //수학
		for (int i = 0; i < su1; i++) {
			math[i] = scan.nextInt();
		}	*/

	}
}
