package java_basic;

public class D002_05_SubjectScore {

	public static void main(String[] args) {
		//f 포멧팅의 활용
		//코딩의 순서 : 변수선언 -> 출력선언 -> 수식선언 -> 디버깅
		int kor	= 76;
		int	eng	= 80;
		int	math	= 90;
		int scien	= 67;
		
		int total	= 0;
		float evg	= 0f;
		
		total	= kor + eng + math + scien;
		evg	= total/4f;
		evg	= (int)((evg*100+5)/10)/10f;
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,scien,total,evg);
		
	}

}