package java_basic;

import java.util.Scanner;

public class D002_03_Operation1 {

	public static void main(String[] args) {
//==================================================================================//
		//�Ϲ�ȭ �ȵ� �ڷ�
		System.out.println("ù��° ����\t: "+3);
		System.out.println("�ι�° ����\t: "+5);
		System.out.println("���ϱ�\t\t: "	+(3+5));
		System.out.println("����\t\t: "		+(3-5));
		System.out.println("���ϱ�\t\t: "	+(3*5));
		System.out.println("������\t\t: "	+(3f/5));
		System.out.println();
		System.out.println("��\t\t: "		+(5/3));
		System.out.println("������\t\t: "	+(5%3));
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//�Ϲ�ȭ �� �ڷ�
		int firstInt 	= 3;
		int	sencondInt 	= 5;
		
		float sum 	= firstInt + sencondInt;
		float minus = firstInt - sencondInt;
		float multi = firstInt * sencondInt;
		float div 	= firstInt / (float)sencondInt;
		
		int mock 	= sencondInt / firstInt;
		int namuji 	= sencondInt % firstInt;
		
		System.out.println("ù��° ����\t: "+firstInt);
		System.out.println("�ι�° ����\t: "+sencondInt);
		System.out.println("���ϱ�\t\t: "	+sum);
		System.out.println("����\t\t: "		+minus);
		System.out.println("���ϱ�\t\t: "	+multi);
		System.out.println("������\t\t: "	+div);
		System.out.println();
		System.out.println("��\t\t: "		+mock);
		System.out.println("������\t\t: "	+namuji);
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//������ �� ������ �Է¹޾� ����ϱ�
		Scanner scann = new Scanner(System.in);
		int firstIntA 	= 0;
		int	sencondIntA = 0;
		float sumA = 0f;
		float minusA = 0f;
		float multiA = 0f;
		float divA = 0f;
		int mockA = 0;
		int namujiA = 0;
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		firstIntA 	= scann.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		sencondIntA	= scann.nextInt();
		
		sumA 	= firstIntA + sencondIntA;
		minusA = firstIntA - sencondIntA;
		multiA = firstIntA * sencondIntA;
		divA 	= firstIntA / (float)sencondIntA;
		mockA 	= sencondIntA / firstIntA;
		namujiA 	= sencondIntA % firstIntA;
		
		System.out.println("ù��° ����\t: "+firstIntA);
		System.out.println("�ι�° ����\t: "+sencondIntA);
		System.out.println("���ϱ�\t\t: "	+sumA);
		System.out.println("����\t\t: "		+minusA);
		System.out.println("���ϱ�\t\t: "	+multiA);
		System.out.println("������\t\t: "	+divA);
		System.out.println();
		System.out.println("��\t\t: "		+mockA);
		System.out.println("������\t\t: "	+namujiA);
		
	}

}