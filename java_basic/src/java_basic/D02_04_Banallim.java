package java_basic;

import java.util.Scanner;

public class D02_04_Banallim {

	public static void main(String[] args) {		

		//���� �ڵ�
		float num = 1234.56789f;		
		float numRound = (float)((int)((num+0.05)*10)*0.1);
		
		System.out.println("�Է°�\t: "+num);
		System.out.println("�ݿø�\t: "+numRound);
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//������ �ڵ�
		
		float inputFloatA 	= 1234.56789f;
		float outputFloatA 	= 0f;
		//�������� ���̱� ���� ���� �������� �����
		outputFloatA = (int)(inputFloatA*10+0.5f)/10f;
		
		
		System.out.println("�Է°�\t: "+inputFloatA);
		System.out.println("�ݿø�\t: "+outputFloatA);
		
		//��� ������ �������� ������ �������
		//10000 * 0.5 -> 10000 * 100 / 50 / 100 -> 5000
		//�Ǽ������� �Ǿ��ִ��� ���������� ��ȯ�Ͽ� ���� �����
		 
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//���Ŀ� �����ִ� �Ҽ��� ������ �ٲٱ�
		
		float inputFloatB 	= 1234.56789f;
		float outputFloatB 	= 0f;
		outputFloatB = (int)((inputFloatB*100+5)/10)/10f;
		
		
		System.out.println("�Է°�\t: "+inputFloatB);
		System.out.println("�ݿø�\t: "+outputFloatB);
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//������ �Ǽ����� �޾� �ݿø� �ϱ�
		Scanner scann = new Scanner(System.in);
		float inputFloatC 	= 0f;
		float outputFloatC 	= 0f;
		
		System.out.print("�ݿø��� �Ǽ��� �Է��ϼ��� : ");
		inputFloatC	= scann.nextFloat();
		
		outputFloatC = (int)((inputFloatC*100+5)/10)/10f;
			
		System.out.println("�Է°�\t: "+inputFloatC);
		System.out.println("�ݿø�\t: "+outputFloatC);
		
	}

}
