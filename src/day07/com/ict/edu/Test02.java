package day07.com.ict.edu;

import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {
		/*
		  *
		  **
		  ***
		  ****
		 */
		for (int i = 1; i < 5; i++) { // 핵심 i=1부터시작
			for (int j = 0; j < i; j++) { // j가 i를 따라감
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("====================");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
				if (i == j)
					break;
			}
			System.out.println();
		}

		System.out.println("====================");

		/*
		        *
		       ** 
		      *** 
		     **** 
		    ***** 
		 */
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}
}
