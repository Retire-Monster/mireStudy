package java_basic;

import java.util.Scanner;

public class D005_01_while_Members {

	public static void main(String[] args) {
//		������ �ʱ�ȭ�� �ƿ� ����� ���� ���� �Է��� �α⵵ ��		
		// ����
		Scanner scann = new Scanner(System.in);
		String meun = "";
		String result = "";

		// �Է�
//		
//		.equals() �Լ��� ���ڿ��� ���� �� �����
//		result.equals("����") �� ���� �� result�� ���� ��ȣ ���� ����
//		"����" �� ������ �Ǵ��Ͽ� ������ ture, �ٸ��� false �� ��ȯ��
//		
		while (!meun.toUpperCase().equals("Q")) {
			System.out.println("1.ȸ������  2.ȸ����ȸ  3.ȸ������  4.ȸ������");
			System.out.println("�޴��� �����ϼ���.(���� : Q)");
//		
//		����ڷκ��� �����͸� �ְ�������� 'String'
//		���ڿ��� �ְ�޴°��� ������ ���δ�.
//		nextLine : ���� ������ ��°�� �޾ƿ��� ��, String Ÿ����
//		
			meun = scann.nextLine();

			// ó�� �� ���
			result = "";
			switch (meun) {
			case "1":
				result = "ȸ������..........\n\n";
				break;
			case "2":
				result = "ȸ����ȸ..........\n\n";
				break;
			case "3":
				result = "ȸ������..........\n\n";
				break;
			case "4":
				result = "ȸ������..........\n\n";
				break;
			case "q":
			case "Q":
				result = "���α׷��� �����մϴ�.\n\n";
				break;

			default:
				result = "�޴������� �ùٸ��� �ʽ��ϴ�.\n\n";
			}
			// ���
			System.out.println(result);
		}

	}

}
