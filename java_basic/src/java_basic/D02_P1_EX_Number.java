package java_basic;

public class D02_Q1_EX_Number {

	public static void main(String[] args) {
//		4자리 정수를 입력받아 각 자리수를 출력하는 프로그램을 작성하시오
//		정수입력  : 6758
//		변수선언
		int inputNumber = 0;
		int e0 = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;

		float varX = 0;
//		수식선언
		
		inputNumber = 1239;
		varX = inputNumber / 10000f;
		
		varX = varX * 10;
		e3 = (int)(varX);
		varX = varX - e3;
		
		varX = varX * 10;
		e2 = (int)(varX);
		varX = varX - e2;
		
		varX = varX * 10;
		e1 = (int)(varX);
		varX = varX - e1;

		varX = varX * 10 + 0.05f;
		e0 = (int)(varX);

//		출력선언
		
		System.out.println("각 자리수를 출력하는 프로그램입니다.");
		System.out.println();
		System.out.println("기준값\t\t: "+inputNumber);
		System.out.println();
		System.out.println("4자리 숫자\t: "+e3);
		System.out.println("3자리 숫자\t: "+e2);
		System.out.println("2자리 숫자\t: "+e1);
		System.out.println("1자리 숫자\t: "+e0);

	}

}
