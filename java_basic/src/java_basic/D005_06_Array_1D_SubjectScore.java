package java_basic;

import java.util.Scanner;

public class D005_06_Array_1D_SubjectScore {
	public static void main(String[] args) {
//		�л����� �Է¹ݰ� �� �л�����ŭ ����, ����, ����, ���� ������ �Է¹޾�
//		������ ����� ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�

		// ����
		Scanner scann = new Scanner(System.in);
		String[] label = { "����", "�̸�", "����", "����", "����", "����", "����", "���" };
		String[] name;
//		������� ������ ���� ����
		final int STUDENT_NUM;

		int[] kor;
		int[] eng;
		int[] math;
		int[] scien;
		int[] total;
		float[] evg;

		// �Է�
		System.out.print("�л��� : ");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
//		���⼭ scann.nextLine(); �� �Է����� ������
//		�л����� �Է��Ҷ� �߰��� '\n' (Enter) ���๮�ڸ�
//		�����ϱ� �����̴�.
		name = new String[STUDENT_NUM];
		kor = new int[STUDENT_NUM];
		eng = new int[STUDENT_NUM];
		math = new int[STUDENT_NUM];
		scien = new int[STUDENT_NUM];
		total = new int[STUDENT_NUM];
		evg = new float[STUDENT_NUM];

		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println("�л� " + (i + 1) + " ���� �Է�");
			System.out.print("�̸� : ");
			name[i] = scann.nextLine();
			System.out.print("���� : ");
			kor[i] = scann.nextInt();			scann.nextLine();
			System.out.print("���� : ");
			eng[i] = scann.nextInt();			scann.nextLine();
			System.out.print("���� : ");
			math[i] = scann.nextInt();			scann.nextLine();
			System.out.print("���� : ");
			scien[i] = scann.nextInt();			scann.nextLine();

		}
		System.out.println("====================�����Է��� ���ƽ��ϴ�====================");
		// ó��
		for (int i = 0; i < STUDENT_NUM; i++) {
			total[i] = kor[i] + eng[i] + math[i] + scien[i];
			evg[i] = (int) ((total[i] / 4f) * 100 + 0.5f) / 100f;
		}

		// ���
		for (int i = 0; i < label.length; i++) {
			System.out.print(label[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t"
					+ scien[i] + "\t" + total[i] + "\t" + evg[i] + "\t");

		}
	}

}
