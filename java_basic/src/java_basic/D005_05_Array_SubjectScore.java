package java_basic;

public class D005_05_Array_SubjectScore {

	public static void main(String[] args) {
//		선언과 동시에 초기화 하기
//		리터널 방식
		String[] label = { "순번", "이름", "국어", "영어", "수학", "과학", "총점", "평균" };

		String[] name = { "이민호", "이상재", "나재길", "탁제훈" };

		int[] kor = { 71, 81, 91, 61 };
		int[] eng = { 72, 82, 92, 62 };
		int[] math = { 73, 83, 93, 63 };
		int[] scien = { 74, 84, 94, 64 };
		int[] total = new int[4];
		float[] evg = new float[4];

		// 처리
		for (int stuNum = 0; stuNum < 4; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + scien[stuNum];
			evg[stuNum] = (int) ((total[stuNum] / 4f) * 100 + 0.5f) / 100f;
		}

		// 출력
		for (int i = 0; i < label.length; i++) {
			System.out.print(label[i] + "\t");
		}
		System.out.println();
		for (int stuNum = 0; stuNum < 4; stuNum++) {
			System.out.println(stuNum + "\t" + name[stuNum] + "\t" + kor[stuNum] + "\t" + eng[stuNum] + "\t"
					+ math[stuNum] + "\t" + scien[stuNum] + "\t" + total[stuNum] + "\t" + evg[stuNum] + "\t");
		}
	}
}
