package java_basic;

public class D004_04_For_MultiplicationTable {

	public static void main(String[] args) {
//		구구단표를 for 문, 중첩 반복기능을 활용하여 만들기
		
		//선언
		int dan = 0;
		int gop = 0;
		String result ="";
		
		//처리
		for (dan=2;dan<10;dan++) {
			for (gop=1;gop<10;gop++) {
				result += (dan + " * " + gop + " = " + (dan*gop) + " \n");
			}
			result += "\n";
		}
		
		//출력
		System.out.println("구구단을 출력하는 프로그램 입니다.");
		System.out.println(result);

	}
}
