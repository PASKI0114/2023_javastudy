package day06.com.ict.edu;

public class Ex01_while2 {
	public static void main(String[] args) {
		// 구구단 -1
		int i = 2;

		while (i < 10) { // 여기로 올라옴
			int j = 1; // j 값 재지정
			while (j < 10) {
				System.out.println(i + "x" + j + "=" + (i * j) + "\t");
				j++;
			}
			i++;
		}
		System.out.println("=================================================");

		i = 2;
		while (i < 10) { // 여기로 올라옴
			int j = 1; // j 값 재지정
			while (j < 10) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println("=================================================");

		i = 1;
		while (i < 10) { // 여기로 올라옴
			int j = 2; // j 값 재지정
			while (j < 10) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
