package java_basic;

public class D02_02_Casting {

	public static void main(String[] args) {
		// 바이트와 바이트의 계산은 안됨
		// 강제로 돌아가게 하기 위해서는
		// byte c = (byte)(a*b);
		// 라는 형식으로 작성해야함 다만 값이 온전하지 못함
		byte a0 = 127;
		byte b0 = 127;
		int  c0 = a0 * b0; //결과 값 : '1'
		
		// 정수 자료형간 값의 대입은 더 큰 자료형에 대입 할 때는 문제가 없다.
		// 이는 아래와 같이 '캐스팅' 이라는 과정을 컴파일 과정에서 자동으로 진행함
		// 이를 '자동형변환' 이라함
		
		long l0 = c0;
		
		// 위의 long 자료형을 더 작은 int형에 대입하면 문제가 발생함 ↓↓↓↓
		// ex) int i = l;		 [문제가 발생하는 예시]
	
		// 이러한 문제를 방지하기 위해 자료형간 대입은 타입을 맞추거나 아래와 같이 형변환을 해야 함
		// ex) int i = (int)l
		// 이를 '강제케스팅' 이라 함
		
		// 이때 long -> float 도 자동형변환 하는 특징이 있음
		// 이는 long은 8바이트, float 4바이트 임에도 변환이 가능한 이유는
		// float는 값의 표현 범위가 long에서 표현 할 수 있는 범위보다 크기 때문에 가능함
		
		// l의 변수값을 입력할때는 변수값 뒤에 'l' 을 꼭 입력해줘야 한다
		long l1 = 9l;
		// 입력하지 않으면 연산시 변수값은 최초 int 값에서 long 값으로 변환하는 과정을 거침
		
		// 마찬가지로 float 자료형 사용시 변수값 뒤에 'f' 를 입력해야 함
		// 입력하지 않으면 연산시 변수값은 최초 double 값에서 float 값으로 변환하는 과정을 거침
		float  f1 = 1.2f;
		double d1 = 1.2;
		
		//====================================================================================//
		//연산의 특징
		
		byte   b = 13   ;
		short  s = 3    ;
		int    i = 2    ;
		long   l = 9l   ;
		float  f = 1.2f ;
		double d = 1.2  ;
		
		System.out.println(s+i);	// 정수 '+' 정수 -> 정수
		System.out.println(s/i);	// 정수 '/' 정수 -> 정수

		System.out.println(s+f);	// 정수 '+' 실수 -> 실수
		System.out.println(s/f);	// 정수 '/' 실수 -> 실수
		
		System.out.println("몫 : "+ s/i);
		System.out.println("나머지 : "+ s%i);
		
		
	}
	
}
