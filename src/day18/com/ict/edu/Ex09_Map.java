package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex09_Map {
	//Map 인터페이스 : Key 와 Value가 1:1 매핑 구조를 가지고있다.
	//				Key는 중복될 수 없다.
	//				Value는 중복가능.
	//				Key룰 호출 Value가 나온다.
	//				Key를 별도로 관리 (Set으로 관리)=>KeySet()
	//				put(Key, Value)로 추가할수있다.
	//관련 클래스 :HashMap
	
	public static void main(String[] args) {
		//생성 (Key가 숫자, Value가 문자열인 경우, )
		
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(0, "한국");
		map1.put(2, "영국");
		map1.put(3, "미국");
		map1.put(10, "영국");
		map1.put(16, "s남아프리카공화국");
		System.out.println(map1);
		
		map1.put(10, "대만");
		System.out.println(map1);
		
		//하나씩 출력 get(Key)
		
		System.out.println(map1.get(2));
		System.out.println(map1.get(1));//null
		
		//삭제 : remove(Key) : Key, value 삭제 ,
		map1.remove(5);
		System.out.println(map1);
		
		//Key를 set에서 관리하게 한다. => keySet();
		
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println();
		
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(map1.get(k));
		}
		System.out.println();
		
		//entrySet()메서드는 key value의 값이 모두 필요한경우 사용
		Set set1 = map1.entrySet();
		Iterator it2 = set1.iterator(); 
		while (it2.hasNext()) {
			Entry entry = (Entry) it2.next();
			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getKey();
			System.out.println(key+ ":"+value);
			
		}
		
	}

	
}
