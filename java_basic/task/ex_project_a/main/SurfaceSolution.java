package ex_project_a.main;

import java.util.Scanner;

import ex_project_a.CircleVO;
import ex_project_a.RectangularVO;
import ex_project_a.TriangleVO;

public class SurfaceSolution {

	private TriangleVO triangleVO;
	private RectangularVO rectangularVO;
	private CircleVO circleVO;
	private int menu;

	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("������ �����Ͻÿ�.");
		System.out.println("1.�ﰢ��   2.�簢��   3.��");
		menu = scann.nextInt();
		scann.nextLine();

		switch (menu) {
		case 1:
			triangleVO = new TriangleVO();
			System.out.print("�غ� : ");
			triangleVO.setBaseLine(scann.nextInt());
			scann.nextLine();
			System.out.print("���� : ");
			triangleVO.setHeight(scann.nextInt()); 
			scann.nextLine();
			break;
		case 2:
			rectangularVO = new RectangularVO();
			System.out.print("���� : ");
			rectangularVO.setGaro(scann.nextInt());
			scann.nextLine();
			System.out.print("���� : ");
			rectangularVO.setSero(scann.nextInt());
			scann.nextLine();
			break;
		case 3:
			circleVO = new CircleVO();
			System.out.print("������ : ");
			circleVO.setRadius(scann.nextInt());
			scann.nextLine();
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			;
		}

	}

	public void process() {
		switch (menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0); // (����õ)(jvm�� ���� �����)�������� ��ɾ�
		}
	}

	public void output() {
		switch (menu) {
		case 1:
			System.out.println("�ﰢ���� ���� : " + triangleVO.surface());
			break;
		case 2:
			System.out.println("�簢���� ���� : " + rectangularVO.surface());
			break;
		case 3:
			System.out.println("���� ���� : " + circleVO.surface());
			break;
		default:
			;
		}
		System.out.println("����Ͻ÷��� �ƹ��⳪ �����ÿ�");
		System.out.println("���� : Q");
		String menu = new Scanner(System.in).nextLine();// �Է� �ν��Ͻ� (Scanner �� 1ȸ�� ���������)
		if (menu.toUpperCase().equals("Q")) {
			System.exit(0); // (����õ)(jvm�� ���� �����)�������� ��ɾ�
		}
		// �̷��� ���ʿ��� �ڷḦ ã�� �����ϴ� �������÷��� ��� ����� ����(�޸� ȯ��)
		// ���� ���� ����� ���� �޸� �Ҵ��� ������ �� ����
	}
}
