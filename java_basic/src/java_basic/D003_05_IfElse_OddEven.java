package java_basic;

import java.util.Scanner;

public class D003_05_IfElse_OddEven {

	public static void main(String[] args) {
//		������ ���� �ϳ��� �Է¹޾� Ȧ�� Ȥ�� ¦�������� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�
//		���)
//		���� �ϳ��� �Է��Ͻÿ�.
//		5
//		
//		�Է��� ���� 5�� Ȧ���Դϴ�.
//		
//		���)
//		���� �ϳ��� �Է��Ͻÿ�
//		
//		�Է��� ���� 4�� ¦���Դ�.
//==================================================================================//
		Scanner scann = new Scanner(System.in);
		int userInput = 0;
		char txt = ' ';

		System.out.println("���� �Ѱ��� �Է��ϼ���");
		userInput = scann.nextInt();

		if (userInput % 2 == 0) {
			txt = '¦';
		} else {
			txt = 'Ȧ';
		}
		System.out.println("�Է��� ���� " + userInput + " (��)�� " + txt + "�� �Դϴ�.");
	}

}
