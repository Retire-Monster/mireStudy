package java_basic;

public class D002_Q1_Number {

	public static void main(String[] args) {
//		4�ڸ� ������ �Է¹޾� �� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//		�����Է�  : 6758
//		��������
		int inputNumber = 0;
		int num4 = 0;
		int num3 = 0;
		int num2 = 0;
		int num1 = 0;
		int varX = 0;
		int varY = 0;
//		���ļ���

		inputNumber = 6758;

		varX = inputNumber;
		num4 = (int) (varX * 0.001);

		varY = num4 * 10;
		num3 = (int) (varX * 0.01) - varY;

		varY = num4 * 100 + num3 * 10;
		num2 = (int) (varX * 0.1) - varY;

		varY = num4 * 1000 + num3 * 100 + num2 * 10;
		num1 = varX - varY;
//		��¼���

		System.out.println("�� �ڸ����� ����ϴ� ���α׷��Դϴ�.");
		System.out.println();
		System.out.println("���ذ�\t\t: " + inputNumber);
		System.out.println();
		System.out.println("4�ڸ� ����\t: " + num4);
		System.out.println("3�ڸ� ����\t: " + num3);
		System.out.println("2�ڸ� ����\t: " + num2);
		System.out.println("1�ڸ� ����\t: " + num1);

	}

}
