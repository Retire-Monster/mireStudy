package java_basic;

public class D005_05_Array_SubjectScore {

	public static void main(String[] args) {
//		����� ���ÿ� �ʱ�ȭ �ϱ�
//		���ͳ� ���
		String[] label = { "����", "�̸�", "����", "����", "����", "����", "����", "���" };

		String[] name = { "�̹�ȣ", "�̻���", "�����", "Ź����" };

		int[] kor = { 71, 81, 91, 61 };
		int[] eng = { 72, 82, 92, 62 };
		int[] math = { 73, 83, 93, 63 };
		int[] scien = { 74, 84, 94, 64 };
		int[] total = new int[4];
		float[] evg = new float[4];

		// ó��
		for (int stuNum = 0; stuNum < 4; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + scien[stuNum];
			evg[stuNum] = (int) ((total[stuNum] / 4f) * 100 + 0.5f) / 100f;
		}

		// ���
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
