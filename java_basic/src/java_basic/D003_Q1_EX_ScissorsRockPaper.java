package java_basic;

import java.util.Scanner;

public class D003_Q1_EX_ScissorsRockPaper {

	public static void main(String[] args) {
//		���������� ���ǹ�, ��ĵ�Լ��� Ȱ���Ͽ� ���������� ���� �����

		String com_kwb = ""; // ���� 0, ���� 1, �� 2
		int com_kwb_num = 0;

		String my_kwb = ""; // ���� 0, ���� 1, �� 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		// �Է�
		com_kwb_num = (int) Math.random() * 3;

		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");

		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		my_kwb_num = menu - 1;
//		
//		'������ ����'�� Ȱ���� ���
//		�Է°��� 1�� ���ϰ� 3���� ������ ���� ��������.
//		
//		��ǻ��	0 1 2 0 1 2 0 1 2 0 1 2 0
//		=================================
//		�Է°�	1 2 0 1 2 0 1 2 0 1 2 0 1
//		��	��	��  (�Է°� +1)	��	��	��
//		�Է°�	2 3 1 2 3 1 2 3 1 2 3 1 2
//		��	��	��  (�Է°� %3)	��	��	��
//		�Է°�	0 1 2 0 1 2 0 1 2 0 1 2 0
//		=================================
//		��ǻ��	0 1 2 0 1 2 0 1 2 0 1 2 0
//		�Է°�	0 1 2 0 1 2 0 1 2 0 1 2 0
//		
//		�̷��� ���� �����ϰ� ���� �� ���� �� ���� ���
//		��ǻ�Ͱ� �̰�� �Ǵ��� �� �ְ� �ȴ�.
//		
//		�̸����� �Ʒ��� ���� ��������� ���и� �Ǵ��� �� �ִ�.
//		
//		1. ������? -> �����ϴ�.
//		2. ���ʰ��� ������? -> �����ϴ�
//		3. ���ʰ��� �ٸ���? -> �̰���ϴ�.
//				
//		������ ���������� ���и� �Ǵ��� �� �ִ�.
//		
		if (com_kwb_num == (my_kwb_num + 1) % 3) {
			juge = "�����ϴ�.";
		} else {
			if (com_kwb_num == my_kwb_num) {
				juge = "�����ϴ�.";
			} else {
				juge = "�̰���ϴ�.";
			}
		}
//		
//		else if ���� Ȱ��
//		�ݺ��Ǵ� else ���� if ���� ���ļ�
//		���ǹ� �ۼ��� �ܼ�ȭ �Ѵ�.
//		
		if (my_kwb_num == 0) {
			my_kwb = "����";
		} else if (my_kwb_num == 1) {
			my_kwb = "����";
		} else {
			my_kwb = "��";
		}

		if (com_kwb_num == 0) {
			com_kwb = "����";
		} else if (com_kwb_num == 1) {
			com_kwb = "����";
		} else {
			com_kwb = "��";
		}

		// ���
		System.out.println("��ǻ�� : " + com_kwb);
		System.out.println("��� : " + my_kwb);
		System.out.println(juge);
	}
}