package java_basic;

public class D002_Q1_Number {

	public static void main(String[] args) {
//		4자리 정수를 입력받아 각 자리수를 출력하는 프로그램을 작성하시오
//		정수입력  : 6758
//		변수선언
		int inputNumber = 0;
		int num4 = 0;
		int num3 = 0;
		int num2 = 0;
		int num1 = 0;
		int varX = 0;
		int varY = 0;
//		수식선언

		inputNumber = 6758;

		varX = inputNumber;
		num4 = (int) (varX * 0.001);

		varY = num4 * 10;
		num3 = (int) (varX * 0.01) - varY;

		varY = num4 * 100 + num3 * 10;
		num2 = (int) (varX * 0.1) - varY;

		varY = num4 * 1000 + num3 * 100 + num2 * 10;
		num1 = varX - varY;
//		출력선언

		System.out.println("각 자리수를 출력하는 프로그램입니다.");
		System.out.println();
		System.out.println("기준값\t\t: " + inputNumber);
		System.out.println();
		System.out.println("4자리 숫자\t: " + num4);
		System.out.println("3자리 숫자\t: " + num3);
		System.out.println("2자리 숫자\t: " + num2);
		System.out.println("1자리 숫자\t: " + num1);

	}

}
