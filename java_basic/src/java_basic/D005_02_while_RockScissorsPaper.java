package java_basic;

import java.util.Scanner;

public class D005_02_while_RockScissorsPaper {

	public static void main(String[] args) {

		// �������� ����
		Scanner scann = new Scanner(System.in);
		
		String com_kwb = ""; // ���� 0, ���� 1, �� 2
		int com_kwb_num = 0;

		String my_kwb = ""; // ���� 0, ���� 1, �� 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		String quti = "";

		// �Է�
		while (!quti.toUpperCase().equals("Q")) {

			com_kwb_num = (int) Math.random() * 3;

			System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
			System.out.println("����� ������?");
			System.out.println("1.���� 2.���� 3.��");

			while (true) {
				menu = scann.nextInt();
				scann.nextLine();
//				
//				nextInt ���� scann.nextLine(); �� �����ν�
//				menu �� ������ �ֱ����� �Էµǰ� ���� \n ���ڸ� �����Ѵ�
//				�̸� ���� �Է¿� ���� �������� ���´�.
//				

				if (menu < 1 || menu > 3) {
					System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
				} else {
					break;
				}
			}

			my_kwb_num = menu - 1;

			// ó��
			if (com_kwb_num == (my_kwb_num + 1) % 3) {
				juge = "�����ϴ�.";
			} else if (com_kwb_num == my_kwb_num) {
				juge = "�����ϴ�.";
			} else {
				juge = "�̰���ϴ�.";
			}

			switch (my_kwb_num) {
			case 0:
				my_kwb = "����";
				break;
			case 1:
				my_kwb = "����";
				break;
			default:
				my_kwb = "��";
			}

			switch (com_kwb_num) {
			case 0:
				com_kwb = "����";
				break;
			case 1:
				com_kwb = "����";
				break;
			default:
				com_kwb = "��";
			}

			// ���
			System.out.println("��ǻ�� : " + com_kwb);
			System.out.println("��� : " + my_kwb);
			System.out.println(juge);
			System.out.println();
			System.out.println("�� �Ұſ���?(�׸� : Q)");
			System.out.println("����Ϸ��� �ƹ�Ű�� ��������");
			quti = scann.nextLine();

		}
		System.out.println("================================");
		System.out.println("���������� ���α׷��� �����մϴ�");
		System.out.println("================================");
	}

}
