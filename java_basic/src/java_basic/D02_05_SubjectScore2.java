package java_basic;

import java.util.Scanner;

public class D02_05_SubjectScore2 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		int kor	= 0;
		int	eng	= 0;
		int	math = 0;
		int scien = 0;
		int total = 0;
		float evg = 0f;
		
		
		System.out.println("국어 점수를 정수로 입력하시오");
		kor = scann.nextInt();
		
		System.out.println("영어 점수를 정수로 입력하시오");
		eng = scann.nextInt();
		
		System.out.println("수학 점수를 정수로 입력하시오");
		math = scann.nextInt();
		
		System.out.println("과학 점수를 정수로 입력하시오");
		scien = scann.nextInt();
		
		
		total = kor + eng + math + scien;
		evg	= total/4f;
		evg	= (int)((evg*100+5)/10)/10f;
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,scien,total,evg);

	}

}