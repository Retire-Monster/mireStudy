package java_basic;

import java.util.Scanner;

public class D005_06_Array_1D_SubjectScore {
	public static void main(String[] args) {
//		학생수를 입력반고 그 학생수만큼 국어, 수학, 영어, 과학 점수를 입력받아
//		총점과 평균을 나타내는 프로그램을 작성하시오

		// 선언
		Scanner scann = new Scanner(System.in);
		String[] label = { "순번", "이름", "국어", "영어", "수학", "과학", "총점", "평균" };
		String[] name;
//		상수값을 가지는 변수 선언
		final int STUDENT_NUM;

		int[] kor;
		int[] eng;
		int[] math;
		int[] scien;
		int[] total;
		float[] evg;

		// 입력
		System.out.print("학생수 : ");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
//		여기서 scann.nextLine(); 를 입력하지 않으면
//		학생수를 입력할때 추가된 '\n' (Enter) 개행문자를
//		제거하기 위함이다.
		name = new String[STUDENT_NUM];
		kor = new int[STUDENT_NUM];
		eng = new int[STUDENT_NUM];
		math = new int[STUDENT_NUM];
		scien = new int[STUDENT_NUM];
		total = new int[STUDENT_NUM];
		evg = new float[STUDENT_NUM];

		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println("학생 " + (i + 1) + " 정보 입력");
			System.out.print("이름 : ");
			name[i] = scann.nextLine();
			System.out.print("국어 : ");
			kor[i] = scann.nextInt();			scann.nextLine();
			System.out.print("영어 : ");
			eng[i] = scann.nextInt();			scann.nextLine();
			System.out.print("수학 : ");
			math[i] = scann.nextInt();			scann.nextLine();
			System.out.print("과학 : ");
			scien[i] = scann.nextInt();			scann.nextLine();

		}
		System.out.println("====================정보입력을 마쳤습니다====================");
		// 처리
		for (int i = 0; i < STUDENT_NUM; i++) {
			total[i] = kor[i] + eng[i] + math[i] + scien[i];
			evg[i] = (int) ((total[i] / 4f) * 100 + 0.5f) / 100f;
		}

		// 출력
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
