package java_basic;

import java.util.Scanner;

public class D002_06_ConsoleInput {

	public static void main(String[] args) {
//		����Ʈ ����Ű Ctrl + Shifte + O
		Scanner scann = new Scanner(System.in);

//		scann.nextInt();	�����Է�
//		scann.nextFloat();	�Ǽ��Է�
		
		System.out.print("������ �Է� : ");
		int inputInt 		= scann.nextInt();
		
		System.out.print("�Ǽ��� �Է� : ");
		float inputFloat	= scann.nextFloat();
		
		System.out.println("�Է��� ���� : "+inputInt);
		System.out.println("�Է��� �Ǽ� : "+inputFloat);
		
	}

}
