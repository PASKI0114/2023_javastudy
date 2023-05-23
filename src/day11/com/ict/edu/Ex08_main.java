package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		//5명의 이름, 국어, 영어, 수학을 입력받아서
		//이름 총점 평균 학점 순위를 구하고
		//순위 기준으로 오름차순 정렬해서 출력하자

		Scanner scan = new Scanner(System.in);
		
		//Ex08_method로 만들어진 객체만 저장하는 배열 = 참조자료형 배열)
		//int[]k1 = new int[];
		Ex08_method[] arr = new Ex08_method[5];
		for (int i = 0; i < arr.length; i++) {
			Ex08_method person = new Ex08_method();//안에서 저장
			
			System.out.println("이름: ");
			person.name = scan.next();
			
			System.out.println("국어: ");
			person.kor = scan.nextInt();
			
			System.out.println("영어: ");
			person.eng = scan.nextInt();
			
			System.out.println("수학: ");
			person.math = scan.nextInt();
			
			person.sum = person.kor + person.eng +person.math;
			
			person.avg = (int)(person.sum/3.0*10)/10.0;
			
			if(person.sum >= 90) {
			    person.hak = "A학점";
			} else if(person.sum >= 80) {
			    person.hak = "B학점";
			} else if(person.sum >= 70) {
			    person.hak = "C학점";
			} else {    
			    person.hak = "F학점";
			}
			
			person.rank = 1;
			
			arr[i] = person;//i가 증가

		}
		
		//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		
		//정렬
		//임시저장
		Ex08_method tmp = new Ex08_method();
		
		//오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		
		//출력 -출력먼저
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].name+"\t");
				System.out.print(arr[i].sum+"\t");
				System.out.print(arr[i].avg+"\t");
				System.out.print(arr[i].hak+"\t");
				System.out.println(arr[i].rank);
			}
		
	}
}