package project_a;

import java.util.Scanner;

public class ForCircleVO {
	
	final double PI = Math.PI;
	int radius = 0;
	float answer = 0;
	
	
	public void UserInput() {
	Scanner scann = new Scanner(System.in);
	System.out.println("==========================");
	System.out.println("���� ���̸� ���մϴ�");
	System.out.println("������ x ������ x �� = ����");
	System.out.println("==========================");
	System.out.print("������ : ");
	radius = scann.nextInt(); scann.nextLine();
	answer = (int)(radius*radius*(PI*100)/10)/10f;
	System.out.println("���� ���� : "+answer);
	}
}
