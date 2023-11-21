package java_basic;

public class D03_02_LoginOperation {

	public static void main(String[] args) {

//		아래 수식은 참고를위한 예시로 실제 프로그래밍에서는 활용해서는 안되는 방식이다
//		실제 변수값 선언 후 논리식을 작성해야 한다.
//		아래와 같이 논리식에서 변수를 선언하는 방식은 잘못된 방식이다.

//==================================================================================//
		System.out.println("=======================================================");
		System.out.println("AND 연산의 판단생략");
//==================================================================================//
		int a = 0;
		int b = 0;
		int c = 0;

		boolean result;

		result = ((a = 1) > (b = 2)) && ((c = 3) > 2);

		System.out.println("a : " + a); // 1
		System.out.println("b : " + b); // 2
		System.out.println("c : " + c); // 0
		System.out.println("result : " + result); // false

//		변수 c의 값이 0으로 나오는 것을 통해 && 연산시 왼쪽의 피연산자가 false 가 나오면
//		오른쪽의 피연산자의 판단을 생략함을 확인할 수 있다.

//==================================================================================//
		System.out.println("-------------------------------------------------------");
//==================================================================================//
		a = 0;
		b = 0;
		c = 0;

		result = ((a = 1) < (b = 2)) && ((c = 3) > 2);

		System.out.println("a : " + a); // 1
		System.out.println("b : " + b); // 2
		System.out.println("c : " + c); // 3
		System.out.println("result : " + result); // true

//		왼쪽의 피연산자가 true 가 나올때만 오른쪽의 피연산자를 실행함을 확인할 수 있다.

//==================================================================================//
		System.out.println("=======================================================");
		System.out.println("OR 연산의 판단생략");
//==================================================================================//
		a = 0;
		b = 0;
		c = 0;

		result = ((a = 1) < (b = 2)) || ((c = 3) > 2);

		System.out.println("a : " + a); // 1
		System.out.println("b : " + b); // 2
		System.out.println("c : " + c); // 3
		System.out.println("result : " + result); // true

//		변수 c의 값이 0으로 나오는 것을 통해 || 연산시 && 연산과 반대로
//		왼쪽의 피연산자가 true 가 나오면 오른쪽의 피연산자의 판단을 생략함을 확인할 수 있다.

//==================================================================================//
		System.out.println("-------------------------------------------------------");
//==================================================================================//
		a = 0;
		b = 0;
		c = 0;

		result = ((a = 1) > (b = 2)) || ((c = 3) > 2);

		System.out.println("a : " + a); // 1
		System.out.println("b : " + b); // 2
		System.out.println("c : " + c); // 3
		System.out.println("result : " + result); // true

//		왼쪽의 피연산자가 false 가 나올때만 오른쪽의 피연산자를 실행함을 확인할 수 있다.

//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//

	}

}
