

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 catch : 예외가 하나가 아니라 여러가지가 발생할 경우 사용
//   주의사항 : Exception을 사용할 경우 반드시 가장아래에 catch문에 사용
//		형식 : try{
//				예외 발생 가능한 문장들;
//				예외가 발생 되면 아래 문장들을 무시하고, catch문으로 이동한다.
//				예외 발생 가능한 문장들;
//				예외 발생 가능한 문장들;
//				}catch(발생할 예외객체 e){
//				예외발생시 처리하는 문장;
//				}catch(발생할 예외객체 e){
//				예외발생시 처리하는 문장;
//				}
public class Ex02_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				int su1 = 50;
				System.out.println("정수 입력 : ");
				int su2 = scan.nextInt();
				System.out.println("정답 : "+ (su1/su2));
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				scan.nextLine();//글자를 입력하면 잔여물이 메모리에 남아서 반복한다. 그래서 지워주기
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌수없습니다");
			}
			
		}
		//System.out.println("수고하셨습니다");
	}
}
