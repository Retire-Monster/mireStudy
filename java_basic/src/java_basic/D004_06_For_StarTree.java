package java_basic;

import java.util.Scanner;

public class D004_06_For_StarTree {

	public static void main(String[] args) {
/*
		�Է��� ������ŭ '*' �� ��� ���α׷��� �ۼ��Ͻÿ�.
	
		����)
		�����Է� : 5
		*****
		
		����)
		�����Է� : 10
		**********
*/	
		//����
		Scanner scann = new Scanner(System.in);
		int userInput = 0;
		String result = "";

		//�Է�
		System.out.print("�����Է� : ");
		userInput = scann.nextInt();
		
		//ó��
		for (int i = 0;i<userInput;i++) {
			result += "*";
		}
		
		//���
		System.out.println(result);
	}
}