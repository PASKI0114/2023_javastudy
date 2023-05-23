package day12.com.ict.edu;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07_Constuctor p1 = new Ex07_Constuctor();
		
		p1.gSum(95, 95, 80);
		p1.gAvg();
		p1.ghak();
		p1.prn();
		System.out.println();
		
		Ex07_Constuctor p2 = new Ex07_Constuctor("둘리");
		p2.gSum();
		p2.gAvg();
		p2.ghak();
		p2.prn();
		System.out.println();

		Ex07_Constuctor p3 = new Ex07_Constuctor(100, 95, 95);
		p3.gSum();
		p3.gAvg();
		p3.ghak();
		p3.prn();
		System.out.println();
		
	}

}
