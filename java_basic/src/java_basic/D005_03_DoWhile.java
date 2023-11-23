package java_basic;

public class D005_03_DoWhile {

	public static void main(String[] args) {
//		기존의 while 문은 아래과 같을때 반복문을 실행하지 않는다
		int tempA = 10;

		while (tempA < 10) {
			System.out.println(tempA);
			tempA++;
		}
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//	
//		do-while 을 통해 우선 실행한 후 반복을 진행할지 고려할 수 있다.
		int tempB = 10;

		do {
			System.out.println(tempB);
			tempB++;
		} while (tempB < 10);

	}
}
