package java_basic;

import java.util.Scanner;

public class D004_05_For_PrimeNumber {

	public static void main(String[] args) {
//		������ �Է¹޾� �Ҽ����� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		//����
		Scanner scann = new Scanner(System.in);
		int userInput = 0;
		boolean isSotsu = true;
		String result = "";
		
		//�Է�
		System.out.print("���� �Է� : ");
		userInput = scann.nextInt();
			
		//ó��
		for(int i=2;i<userInput;i++) {
			if (userInput%i == 0) {
				isSotsu = false;
			}
		}
		if (isSotsu) {
		result += "�ڼ��Դϴ�.";
		} else {
			result += "�ڼ��� �ƴմϴ�.";
		}
		
		//���
		System.out.println(result);
		
	}

}
