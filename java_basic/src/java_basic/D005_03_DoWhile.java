package java_basic;

public class D005_03_DoWhile {

	public static void main(String[] args) {
//		������ while ���� �Ʒ��� ������ �ݺ����� �������� �ʴ´�
		int tempA = 10;

		while (tempA < 10) {
			System.out.println(tempA);
			tempA++;
		}
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//	
//		do-while �� ���� �켱 ������ �� �ݺ��� �������� ����� �� �ִ�.
		int tempB = 10;

		do {
			System.out.println(tempB);
			tempB++;
		} while (tempB < 10);

	}
}
