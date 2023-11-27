package project_a.main;

import java.util.Scanner;

import project_a.ForCircleVO;
import project_a.ForTetragonVO;
import project_a.ForTriangleVO;

public class UserInterfaceVO {

	static void start() {
		System.out.println("�ﰢ��, �簢��, ������ ���̸� ���ϴ� ���α׷��Դϴ�.");
		System.out.println("���Ͻô� ������ �������ּ���");
	}
	static void inputWait() {
		System.out.println("1:�ﰢ��\t2:�簢��\t3:����\t\tQ:����");
		System.out.println("�Է� :");
	}

	static void bar() {
		System.out.println("======================================================");
	}

	public void userStartOrder() {
		String order = "";
		Scanner scann = new Scanner(System.in);

		do {
			order = scann.nextLine();
			switch (order) {
			case "1":
				ForTriangleVO ForTriangleVO = new ForTriangleVO();
				ForTriangleVO.UserInput();
				break;
			case "2":
				System.out.println("�簢���� ���̸� ���մϴ�");
				ForTetragonVO ForTetragonVO = new ForTetragonVO();
				ForTetragonVO.UserInput();

				break;
			case "3":
				System.out.println("������ ���̸� ���մϴ�");
				ForCircleVO ForCircleVO = new ForCircleVO();
				ForCircleVO.UserInput();

				break;
			case "q":
			case "Q":
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� ���� �Է���\n�ٽ� �Է��Ͻÿ�");
				order = " ";
			}
		} while (order == " ");
	}

	public void userReStartOrder() {
		String order = "";
		Scanner scann = new Scanner(System.in);
		bar();
		System.out.println("��� �Ͻ÷��� �ƹ�Ű�� �Է��ϼ���.");
		System.out.println("Q:����");
		order = scann.nextLine();
		switch (order) {
		case "q":
		case "Q":
			bar();
			System.out.println("���α׷��� �����մϴ�.");
			bar();
			break;
		default:
			bar();
			inputWait();
			bar();
			userStartOrder();
		}

	}

}
