package java_basic;

public class D03_04_IF_SubjectScore {

	public static void main(String[] args) {
//		if ���� Ȱ���� ������� �ڵ��з�
		
		int kor = 89;
		int eng = 76;
		int math = 89;
		int scien = 60;

		int total = 0;
		float evg = 0f;
		char grade = 'F';

		total = kor + eng + math + scien;
		evg = total / 4f;
		evg = (int) ((evg * 100 + 5) / 10) / 10f;
		
		if (evg >= 60) {grade = 'D';}
		if (evg >= 70) {grade = 'C';}
		if (evg >= 80) {grade = 'B';}
		if (evg >= 90) {grade = 'A';}
		
		System.out.println("����\t����\t����\t����\t����\t���\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c", kor, eng, math, scien, total, evg, grade);

	}

}
