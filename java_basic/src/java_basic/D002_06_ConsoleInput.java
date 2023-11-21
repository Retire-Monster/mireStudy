package java_basic;

import java.util.Scanner;

public class D002_06_ConsoleInput {

	public static void main(String[] args) {
//		임포트 단축키 Ctrl + Shifte + O
		Scanner scann = new Scanner(System.in);

//		scann.nextInt();	정수입력
//		scann.nextFloat();	실수입력
		
		System.out.print("정수를 입력 : ");
		int inputInt 		= scann.nextInt();
		
		System.out.print("실수를 입력 : ");
		float inputFloat	= scann.nextFloat();
		
		System.out.println("입력한 정수 : "+inputInt);
		System.out.println("입력한 실수 : "+inputFloat);
		
	}

}
