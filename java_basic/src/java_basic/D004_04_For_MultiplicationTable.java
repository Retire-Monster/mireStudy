package java_basic;

public class D004_04_For_MultiplicationTable {

	public static void main(String[] args) {
//		������ǥ�� for ��, ��ø �ݺ������ Ȱ���Ͽ� �����
		
		//����
		int dan = 0;
		int gop = 0;
		String result ="";
		
		//ó��
		for (dan=2;dan<10;dan++) {
			for (gop=1;gop<10;gop++) {
				result += (dan + " * " + gop + " = " + (dan*gop) + " \n");
			}
			result += "\n";
		}
		
		//���
		System.out.println("�������� ����ϴ� ���α׷� �Դϴ�.");
		System.out.println(result);

	}
}
