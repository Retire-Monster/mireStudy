package java_basic;

import java.util.Scanner;

public class D03_06_IfElse_Multiple0 {

	public static void main(String[] args) {
//		�Է��� ������ 2,3,5�� ������� �Ǻ��Ͻÿ�
		Scanner scann = new Scanner(System.in);
		int userInput = 0;
		int num = 0;
		boolean check = false ;
		
		System.out.println("���� �Ѱ��� �Է��ϼ���");
		userInput = scann.nextInt();

		System.out.print("�Է��� ���� " + userInput + " (��)�� ");
		if (userInput % 2 == 0) {
			check = true;
			num = 2;
			System.out.print(num);
		}
		if (num != 0) {
			System.out.print(", ");
		}
		num = 0;
		if (userInput % 3 == 0) {
			check = true;
			num = 3;
			System.out.print(num);
		}
		if (num != 0) {
			System.out.print(", ");
		}
		num = 0;
		if (userInput % 5 == 0) {
			check = true;
			num = 5;
			System.out.print(num);
		}
		if (check) {
			System.out.print("�� ����Դϴ�.");
		} else {
			System.out.print("2,3,5 �� ����� �ƴմϴ�.");
		}

	}

}
