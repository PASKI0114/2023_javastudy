package day18.com.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		//컬렉션을 배열로 =>
		//배열을 컬렉션으로 =>
		
		String[] str ={"", "", "", ""};
		HashSet<> set1 = new HashSet<>();
		HashSet<> set2 = new HashSet<>();
		
		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		System.out.println();
		
		//set1dml 모든 요소를 센 2에 넣어주세요(addAll());
		set2.add(set1);
		System.out.println(set1);
		System.out.println();
		
		//삭제 : 클리어(), remove(Object o)
		//비어있는지 확인 : isEmpty();
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println(set2.remove("JAVA"));
		System.out.println(set2.remove("JAVA"));
		
		//중복불가
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		
		
		
		
	}
}
