package java_basic;

public class D004_01_Switch {

	public static void main(String[] args) {
		int inputInt = 0;

//		switch 문 jdk 버전별 정보
//		jdk 1.6 이하에서는 정수만, jdk 1.7 이상에서는 문자열 비교가 가능해짐

//		기존 if 문은 길어지는 내용을 switch 함수로 간략화 할 수있다.
//		if (inputInt%2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}

		inputInt = 988;
//		경우의 수가 명확할 때 사용하는 switch 함수 이다.
//		단 스위치 함수는 or 형태로 진행된다.
//		그러한 이유로 아래 코드를 실행하면 다음과 같이 출력된다.
//		출력 : 짝수입니다.
//		출력 : 홀수입니다.
		switch (inputInt % 2) {
		case 0:
			System.out.println("짝수입니다.");
		case 1:
			System.out.println("홀수입니다.");
		}

//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		inputInt = 988;
//		위과 같은 문제를 막기 위해 brack 문을 사용한다.
		switch (inputInt % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		}
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		inputInt = 988;
//		또한 이러한 switch 문의 특성을 활용하여 or 연산을 할 수있다.
//		마지막에 사용된 default 문은 case 이외의 모든것을 말한다.	

		switch (inputInt % 7) {
		case 0:case 1:
			System.out.println("나머지가 0 또는 1 입니다.");
			break;
		case 2:case 3:
			System.out.println("나머지가 2 또는 3 입니다.");
			break;
		case 4:
			System.out.println("나머지가 4 입니다.");
			break;
		default:
			System.out.println("나머지가 5 또는 6 입니다.");
		}
	}
}