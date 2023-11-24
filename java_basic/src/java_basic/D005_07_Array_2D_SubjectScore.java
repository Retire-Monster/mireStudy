package java_basic;

import java.util.Scanner;

import javax.security.auth.Subject;

public class D005_07_Array_2D_SubjectScore {
	public static void main(String[] args) {
//		
		// ����
		Scanner scann = new Scanner(System.in);

		final int STUDEN_NUM;
		final int SUBJECT_NUM;

		String[] name;
		String[] suject;
		int[][] score;
		int[] total;
		float[] evg;

		// �Է�
		System.out.print("�л� �� : ");
		STUDEN_NUM = scann.nextInt();
		scann.nextLine();

		System.out.print("���� �� : ");
		SUBJECT_NUM = scann.nextInt();
		scann.nextLine();

		name = new String[STUDEN_NUM];
		total = new int[STUDEN_NUM];
		evg = new float[STUDEN_NUM];
		suject = new String[SUBJECT_NUM];
		score = new int[STUDEN_NUM][SUBJECT_NUM];

		for (int i = 0; i < SUBJECT_NUM; i++) {
			System.out.print((i + 1) + "/" + SUBJECT_NUM + " �� ���� : ");
			suject[i] = scann.nextLine();
		}
		// �����Է�
		for (int i = 0; i < STUDEN_NUM; i++) {
			System.out.println((i + 1) + "/" + STUDEN_NUM + " �� �л��� ������ �Է��Ͻÿ�");
			System.out.print("�̸� : ");
			name[i] = scann.nextLine();
			for (int j = 0; j < SUBJECT_NUM; j++) {
				System.out.print(suject[j] + " : ");
				score[i][j] = scann.nextInt();
				scann.nextLine();
			}
		}
		System.out.println("====================�����Է��� ���ƽ��ϴ�====================");
		// ó��
		for (int i = 0; i < STUDEN_NUM; i++) {
			for (int j = 0; j < SUBJECT_NUM; j++) {
				total[i] += score[i][j];
			}
		}
		for (int i = 0; i < STUDEN_NUM; i++) {
			evg[i] = (int) (total[i] / (float) SUBJECT_NUM * 100 + 0.5f) / 100f;
		}
		// ��� (��)
		System.out.print("����\t�̸�\t");
		for (int i = 0; i < SUBJECT_NUM; i++) {
			System.out.print(suject[i]+"\t");
		}
		System.out.print("����\t���");
		System.out.println();
		
		// ��� (�л�����)
		for (int i = 0; i < STUDEN_NUM; i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for (int j = 0;j < SUBJECT_NUM;j++ ) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(total[i]+"\t"+evg[i]);
			System.out.println();
		}
		System.out.println();
		

	}
}
