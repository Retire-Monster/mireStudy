package java_basic;

public class D002_05_SubjectScore {

	public static void main(String[] args) {
		//f �������� Ȱ��
		//�ڵ��� ���� : �������� -> ��¼��� -> ���ļ��� -> �����
		int kor	= 76;
		int	eng	= 80;
		int	math	= 90;
		int scien	= 67;
		
		int total	= 0;
		float evg	= 0f;
		
		total	= kor + eng + math + scien;
		evg	= total/4f;
		evg	= (int)((evg*100+5)/10)/10f;
		
		System.out.println("����\t����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,scien,total,evg);
		
	}

}