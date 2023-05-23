package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		//스캐너
		Ex07_method test = new Ex07_method();
		//입력받기
		for (int i = 0; i < hak.length; i++) {
			System.out.println("이름 :");
			name[i] = scan.next();
			 
			System.out.println("국어 :");
			kor[i] = scan.nextInt();
			
			System.out.println("영어 :");
			eng[i] = scan.nextInt();
			
			System.out.println("수학 :");
			math[i] = scan.nextInt();
			
			
			//총점
			test.getSum(kor[i], eng[i], math[i]);
			sum[i] = test.sum;
			
			//평균
			
			test.getAvg();
			avg[i] = test.avg;
			
			//학점
			
			test.getHak();
			hak[i] = test.hak;
		
			}
		
		//출력
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.println(hak[i]);
		
		
		}
	}
}
