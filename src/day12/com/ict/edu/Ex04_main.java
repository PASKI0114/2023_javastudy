package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		//5명의 이름, 국어, 영어, 수학을 입력받아서
		//이름 총점 평균 학점 순위를 구하고
		//순위 기준으로 오름차순 정렬해서 출력하자

		Scanner scan = new Scanner(System.in);
		
		//Ex08_method로 만들어진 객체만 저장하는 배열 = 참조자료형 배열)
		//int[]k1 = new int[];
		Ex04_get_set[] arr = new Ex04_get_set[5];
		for (int i = 0; i < arr.length; i++) {
			Ex04_get_set person = new Ex04_get_set();//안에서 저장
			
			System.out.println("이름: ");
			String name = scan.next();
			person.setName(name);
			
			System.out.println("국어: ");
			int kor = scan.nextInt();
			person.setKor(kor);
			
			System.out.println("영어: ");
			int eng = scan.nextInt();
			person.setKor(eng);
			
			System.out.println("수학: ");
			int math = scan.nextInt();
			person.setKor(math);
			
			person.setSum(person.getKor() + person.getEng() +person.getMath());
				
			person.setAvg((int)(person.getSum()/3.0*10)/10.0);
				
			
			if(person.getSum() >= 90) {
		        person.setHak("A학점");
		    }else if(person.getSum() >= 80) {
		        person.setHak("B학점");
		    }else if(person.getSum() >= 70) {
		        person.setHak("C학점");
		    }else {	
		        person.setHak("F학점");
		    }
			
			person.setRank(1);
			
			arr[i] = person;//i가 증가

		}
		
		//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
					
				}
			}
		}
		
		//정렬
		//임시저장
		Ex04_get_set tmp = new Ex04_get_set();
		
		//오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getRank() < arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		
		//출력 -출력먼저
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].getName()+"\t");
				System.out.print(arr[i].getSum()+"\t");
				System.out.print(arr[i].getAvg()+"\t");
				System.out.print(arr[i].getHak()+"\t");
				System.out.println(arr[i].getRank());
			}
		
	}
}