package java_basic;

import java.util.Scanner;

public class D005_Q1_Lottery {

	public static void main(String[] args) {
//======================2023.11.23======================//
//		�ζ� ���α׷��� �ۼ��Ͻÿ�						//
//		(1���� 45 ������ ������ ���� 6��)				//
//														//
//		����)					����)					//
//		�ݾ��� �Է� : 1000		�ݾ��� �Է�  : 3200		//
//		34 23 22 21 11 2		22 33 21 20 11 2		//
//								43 23 11 19 18 7		//
//								27 12 13 16 34 15		//
//								�Ž����� : ��200		//
//======================================================//

		// ����
		Scanner scann = new Scanner(System.in);

		int userInput = 0;
		int money = 0;
		int lotterNum = 0;
		int target = 0;
		double random = Math.random();
		boolean change = false;
		String lotteryOutput = "";
		int[] lotteryData = new int[45];

		// �Է�
		System.out.print("�ݾ��� �Է� : ");
		userInput = scann.nextInt();
		scann.nextLine();
		// ó��
		for (int i = 0; i < 45; i++) {
			lotteryData[i] = (i+1);
		}

		for (int i = 0; i < 6; i++) {
			target = (int) (random * 44);
			lotteryData[i] = lotterNum;
			lotteryData[target] = lotteryData[i];
			lotteryData[target] = lotterNum;
			System.out.println(lotteryOutput);
		}
		
		for (int i = 0; i < 6; i++) {
			lotteryOutput += lotteryData[i];
		}
		
		// ���
		System.out.println(lotteryOutput);
		if (money>0) {
			System.out.println("�Ž����� : ��" + money);
		}

	}

}
