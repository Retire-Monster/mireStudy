package java_basic;

public class D02_Q1_EX_Number {

	public static void main(String[] args) {
//		4�ڸ� ������ �Է¹޾� �� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//		�����Է�  : 6758
//		��������
		int inputNumber = 0;
		int e0 = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;

		float varX = 0;
//		���ļ���
		
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

//		��¼���
		
		System.out.println("�� �ڸ����� ����ϴ� ���α׷��Դϴ�.");
		System.out.println();
		System.out.println("���ذ�\t\t: "+inputNumber);
		System.out.println();
		System.out.println("4�ڸ� ����\t: "+e3);
		System.out.println("3�ڸ� ����\t: "+e2);
		System.out.println("2�ڸ� ����\t: "+e1);
		System.out.println("1�ڸ� ����\t: "+e0);

	}

}
