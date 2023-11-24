package java_basic;

import java.util.Scanner;

import javax.security.auth.Subject;

public class D005_07_Array_2D_SubjectScore {
	public static void main(String[] args) {
//		
		// 선언
		Scanner scann = new Scanner(System.in);

		final int STUDEN_NUM;
		final int SUBJECT_NUM;

		String[] name;
		String[] suject;
		int[][] score;
		int[] total;
		float[] evg;

		// 입력
		System.out.print("학생 수 : ");
		STUDEN_NUM = scann.nextInt();
		scann.nextLine();

		System.out.print("과목 수 : ");
		SUBJECT_NUM = scann.nextInt();
		scann.nextLine();

		name = new String[STUDEN_NUM];
		total = new int[STUDEN_NUM];
		evg = new float[STUDEN_NUM];
		suject = new String[SUBJECT_NUM];
		score = new int[STUDEN_NUM][SUBJECT_NUM];

		for (int i = 0; i < SUBJECT_NUM; i++) {
			System.out.print((i + 1) + "/" + SUBJECT_NUM + " 번 과목 : ");
			suject[i] = scann.nextLine();
		}
		// 점수입력
		for (int i = 0; i < STUDEN_NUM; i++) {
			System.out.println((i + 1) + "/" + STUDEN_NUM + " 번 학생의 정보를 입력하시오");
			System.out.print("이름 : ");
			name[i] = scann.nextLine();
			for (int j = 0; j < SUBJECT_NUM; j++) {
				System.out.print(suject[j] + " : ");
				score[i][j] = scann.nextInt();
				scann.nextLine();
			}
		}
		System.out.println("====================정보입력을 마쳤습니다====================");
		// 처리
		for (int i = 0; i < STUDEN_NUM; i++) {
			for (int j = 0; j < SUBJECT_NUM; j++) {
				total[i] += score[i][j];
			}
		}
		for (int i = 0; i < STUDEN_NUM; i++) {
			evg[i] = (int) (total[i] / (float) SUBJECT_NUM * 100 + 0.5f) / 100f;
		}
		// 출력 (라벨)
		System.out.print("순번\t이름\t");
		for (int i = 0; i < SUBJECT_NUM; i++) {
			System.out.print(suject[i]+"\t");
		}
		System.out.print("총점\t평균");
		System.out.println();
		
		// 출력 (학생정보)
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
