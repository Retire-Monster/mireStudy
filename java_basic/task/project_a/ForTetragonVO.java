package project_a;

import java.util.Scanner;

public class ForTetragonVO {

	public int baseLine = 0;
	public int high = 0;
	public int answer = 0;
	
	public void UserInput() {
	Scanner scann = new Scanner(System.in);
	System.out.println("==========================");
	System.out.println("�簢���� ���̸� ���մϴ�");
	System.out.println("���� x ���� = ����");
	System.out.println("==========================");
	System.out.print("���� : ");
	baseLine = scann.nextInt(); scann.nextLine();
	System.out.print("���� : ");
	high = scann.nextInt(); scann.nextLine();
	answer = baseLine*high;
	System.out.println("�簢���� ���� : "+answer);
	}
}
