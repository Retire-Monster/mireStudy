package java_basic;

import java.util.Scanner;

public class D003_Q1_ScissorsRockPaper {

	public static void main(String[] args) {
//		���������� ���ǹ�, ��ĵ�Լ��� Ȱ���Ͽ� ���������� ���� �����

		Scanner scann = new Scanner(System.in);
		double random = Math.random();
		int target = 0;
		int userInput = 0;
		boolean startBool;
		boolean winningBool;
		String Scissors = "����";
		String Rock = "����";
		String Paper = "��";
		String printCom = "";
		String printUser = "";

		System.out.println("���� ���� �� �����Դϴ�.");
//		target = (int) (random * 3);
		target = 2;
		System.out.println("��ǻ�ʹ� ���� ���߽��ϴ�");
		System.out.println("�Ʒ� ǥ�� �����Ͽ� ������ �Է��� ��ǻ�͸� �̱�ʽÿ�");
		System.out.println("���� : 0 | ���� : 1 | �� : 2");
		userInput = scann.nextInt();

//				user	  com
//		�̱�	����  3 > ��	2
//		�̱�	����  1 > ����	0
//		�̱�	��    2 > ����	1
//		
//		��		����  0 < ����	1
//		��		����  1 < ��	2
//		��		��    2 < ����	3

		startBool = ((userInput > 2) || (userInput < 0));

		if (startBool) {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");

		} else {
			if (target == 0) {
				printCom = Scissors;
			} else {
				if (target == 1) {
					printCom = Rock;
				} else {
					if (target == 2) {
						printCom = Paper;
					}
				}
			}
			if (userInput == 0) {
				printUser = Scissors;
			} else {
				if (userInput == 1) {
					printUser = Rock;
				} else {
					if (userInput == 2) {
						printUser = Paper;
					}
				}

				if ((target == 2) && (userInput == 0)) {
					userInput = 3;
				}

				winningBool = userInput > target;

				System.out.println("��ǻ�� �� : " + printCom + "\n������ �� : " + printUser);
				if (target == userInput) {
					System.out.println("�����ϴ�.");
				} else {
					if (winningBool) {
						if (userInput == 3) {
							userInput = 0;
						}
						System.out.println("�̰���ϴ�.");

					} else {
						System.out.println("�����ϴ�.");
					}
				}
			}
		}
	}
}
