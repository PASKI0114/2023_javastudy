package day18.com.ict.edu;

import java.util.LinkedList;

public class Ex08_LinkedList {
	//Queue(큐) 인터페이스 : FIFO()
	//					 먼저 들어온 정보가 먼저 나감
	//Queue를 구현한 클래스 : LinkedList
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		//추가,삽입 : add, addFirst, addLast, offer, offerFirst, offerLast
		
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("돌리");
		linkedList.addLast("또치");
		linkedList.offerFirst("희동이");
		linkedList.offerLast("마이콜"); // 중복가능
		linkedList.add(0, "차두리");
		System.out.println(linkedList);
		
		if (linkedList.contains("둘리")) {
			System.out.println(linkedList.indexOf("둘리"));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
			
			
			//치환
			linkedList.set(linkedList.lastIndexOf("둘리"), "공실이");	
		}
		System.out.println(linkedList);
		
		//삭제 : remove(Object c), removeFirst(), removeLast()
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.remove("차두리");
		linkedList.remove();//맨앞 객체 삭제
		
		System.out.println(linkedList);
		System.out.println();
		
		
		
		
	}
}
