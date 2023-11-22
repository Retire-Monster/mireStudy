package java_basic;

public class D004_03_For {

	public static void main(String[] args) {
		
		int initInt = 0;
		int sum = 0;
//		
//		++ 는 1씩 증가, -- 는 1씩 감소
//		앞에 붙으면 전치연산자, 
//			└> 앞에 붙어있을 경우 값에 1을 증가시긴 후 연산을 진행함
//			└> ex) 	int a = 1 
//					 ++a == 1   ->   false
//
//		뒤에 붙으면 후치연산자
//			└> 뒤에 붙어있을 경우 연산을 진행 후 값에 1을 증가함
//			└> ex) 	int a = 1 
//				     a++ == 1   ->   ture
//		
//		실질적으로 전치, 후치연산자를 잘 사용하지 않음
//		단독으로 사용할 경우 붙는 방향에 상관이 없어짐
//
		for (int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
//		
//		반복문에 사용된 변수 'i' 값은 관행적으로 'i' 를 사용하는 것임
//		또한 이 변수 'i' 를 for문의 반복 실행문에서 사용도 가능함
//		
		sum = 0;
		for (int i=2;i<=50;i=i+2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}