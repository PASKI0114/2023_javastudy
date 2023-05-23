package day09.com.ict.edu;

public class Ex04_Array {
	public static void main(String[] args) {
		// 순위구하기
		// 1. 모든 사람의 순위를 1등으로 초기값을 지정한다.
		// 2. 모든 사람과 비교해야한다.(자기 자신은 제외)
		// 3. 나(i) 보다 비교대상(j)가 크면 내순위를 증가시킨다.
		int[] su = {90,80,70,95,90,85,75};
		int[] rank = {1,1,1,1,1,1,1};
		for (int i = 0; i < su.length; i++) {
		    for (int j = 0; j < su.length; j++) {
		        if (j == i) continue; //
		        if (su[i] < su[j]) {
		            rank[i]++;
				}
			}			
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i]+ " ");
		} 
		System.out.println();
	}
}
