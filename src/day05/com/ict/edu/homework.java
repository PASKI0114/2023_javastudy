package day05.com.ict.edu;

public class homework {
		public static void main(String[] args) {
			
		//1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		//for문을 이용한 누적합 
			
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
		    if (i % 2 == 0) {
		        sum -= i;
		    } else {
		        sum += i;
		    }
		}
		System.out.println("총합은:" + sum);
		System.out.println("=================================================");
		
		
		//1. if~ else문 
		//농구공 5개씩 한 박스에 들어간다.
		//40개면 8상자, 26개면 6개이다.
		//int k1 = 127개이다.
		//몇 상자가 필요한가요?

		//농구공 5개 = 1박스
		//48=8;
		//26=6;
		//농구공 k1 = 127개
		//127%5 = 몇개인가

		int k1 = 127;
		int boxes;
		if (k1 % 5 == 0) {
		    boxes = k1 / 5;
		} else {
		    boxes = k1 / 5 + 1;
		}
		System.out.println("공을 담을 상자는: " + boxes + "상자");
		System.out.println("=================================================");

		//2.for 문으로 풀기

		for (int i = 1; i < 5; i++) {
		System.out.println("0 0 0 0");
		}

		System.out.println("=================================================");

		 

		//3.이중 for 문으로 풀기

		for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 3; i++) {
				System.out.print(1); 
			}
		System.out.println(0);

		}

		System.out.println("=================================================");

		//4. 1+(-2)+3+(-4)+과 같은 식으로 몇까지 해야 총합이 100이 되는지 구하시오.

		//양수로끝나면 양수가 나온다!

		sum = 0;
		for (int i = 1; i <= 100; i++) {
		    if (i % 2 == 0) {
		        sum += i;
		    } else {
		        sum -= i;
		    }
		}
		System.out.println("총합은:" + sum);
		System.out.println("=================================================");
		
		
		//5.별찍기 for문
		
		for (int i = 0; i < 6; i++) {   //+1
			for (int j = 0; j < i; j++) { //+1
				System.out.print("*");
			}
		System.out.println("");
		}
		System.out.println("==6==============================================");
	
		//6.별찍기 for문2
	
		
		for(int i = 0; i <6; i++){
			for(int j = 5; j>i; j--){
					 System.out.print(" ");
			}
		    for(int k =0; k<i; k++){
					 System.out.print("*");
				}
		 System.out.println();
		}
		System.out.println("================================================");
		
		//별찍기 내맘대로
		         
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			
			}
		System.out.println("");	
		}
			
		
		
	}
}
		

		
	
