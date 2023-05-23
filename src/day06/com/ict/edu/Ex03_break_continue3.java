package day06.com.ict.edu;

public class Ex03_break_continue3 {
	public static void main(String[] args) {
		//레이블 
		
		esc:
			for (int i =1; i <4; i++) {
				System.out.println("11111111");
				for (int j =1 ; j < 6; j++ ) {
					if(i==2) break; esc;
					System.out.println("i= " + i + ", j="+ j);
				}
				System.out.println("2222222222");
			}
			System.out.println("==============");
			
		esc:
			for (int i =1; i <4; i++) {
				System.out.println("11111111");
				for (int j =1 ; j < 6; j++ ) {
					if(j==2) break; esc;
					System.out.println("i= " + i + ", j="+ j);
				}
				System.out.println("2222222222");
			}
			System.out.println("==============");
							
			

	}
}
